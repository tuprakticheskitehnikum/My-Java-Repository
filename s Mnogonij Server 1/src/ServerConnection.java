import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerConnection extends Thread{

	Socket socket;
	Server server;
	DataInputStream din;
	DataOutputStream dout;
	boolean shouldRun = true;
	
	
	public ServerConnection(Socket socket, Server server) {
		super("ServerConnectionThread");
		this.socket = socket;
	}
	
	public void sendStringToClient(String text) {
		try {
			dout.writeUTF(text);
			dout.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void sendStringToAllClients(String text) {
		for(int index =0; index<server.connections.size(); index++) {
			ServerConnection sc = server.connections.get(index);
			sc.sendStringToAllClients(text);
		}
	}
	
	public void run() {
		try {
			dout = new DataOutputStream(socket.getOutputStream());
			din = new DataInputStream(socket.getInputStream());
			
			while(shouldRun) {
				while(din.available() ==0) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				String textIn = din.readUTF();
				sendStringToAllClients(textIn);
			}

			din.close();
			dout.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
