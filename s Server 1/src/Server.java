import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JFrame{

	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	
	public Server() {
		super("Instant Messenger");
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}
		);
		add(userText, BorderLayout.NORTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300,150);
		setVisible(true);
	}
	
	public void startRunning() {
		try {
			server = new ServerSocket(6789, 100);
			while(true) {
				try {
					waitForConnection();
					setupStream();
					whileChatting();
				} catch(EOFException e) {
					showMessage("\n Kur");
				}finally {
					closeCrap();
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//wait for connection, then display ip you're connected with
	private void waitForConnection() throws IOException{
		showMessage("Waiting for someone to connect.....");
		connection = server.accept();
		//When a client connects a connection is made
		showMessage("Connection established"+connection.getInetAddress().getHostName());
	}
	
	//get steam to send and receive data
	private void setupStream() throws IOException{
		//Stream - a way you communicate with another computer
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are up");
	}
	
	private void whileChatting() throws IOException{
		String message = "Yall connected";
		sendMessage(message);
		ableToType(true);
		do {
			try {
				message = (String) input.readObject();
				showMessage("\n"+message);
			}catch(ClassNotFoundException e) {
				showMessage("\n wtf did u send");
			}
		}while(!message.equals("CLIENT - END"));
	}
	
	private void closeCrap() {
		showMessage("\nClosing connection...\n");
		ableToType(false);
		try {
			output.close();
			input.close();
			connection.close();
			server.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void sendMessage(String message) {
		try {
			output.writeObject("SERVER - "+ message);
			output.flush();
			showMessage("\nSERVER - "+ message);
		}catch(IOException e) {
			chatWindow.append("\n ERROR WITH SENDING A MESSAGE");
		}
	}
	
	
	private void showMessage(final String text) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					chatWindow.append(text);
				}
			}
		);
	}
	
	private void ableToType(final boolean tof) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					userText.setEditable(tof);
				}
			}
		);
	}
}
