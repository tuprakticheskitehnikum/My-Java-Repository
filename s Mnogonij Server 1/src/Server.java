import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	ServerSocket ss;
	//Socket s;
	//DataInputStream din;
	//DataOutputStream dout;
	
	ArrayList<ServerConnection> connections = new ArrayList<ServerConnection>();
	boolean shouldRun = true;
	
	public static void main(String[] args) {
		new Server();
	}
	
	public Server() {
		try {
			ss = new ServerSocket(3333);
			while(shouldRun) {
				Socket s = ss.accept();
				ServerConnection sc = new ServerConnection(s, this);
				sc.start();
				connections.add(sc);
			//s = ss.accept();
			//dout = new DataOutputStream(s.getOutputStream());
			//din = new DataInputStream(s.getInputStream());
			}
			
			//listenForData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
/*
	public void listenForData() {
		while(true) {
			try {
				while(din.available() ==0) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				String dataIn = din.readUTF();
				
				dout.writeUTF(dataIn);
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
		
		try {
			din.close();
			dout.close();
			ss.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	*/
}
