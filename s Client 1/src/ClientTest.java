import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args) {
		Client bazuso;
		bazuso = new Client("127.0.0.1");
		bazuso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bazuso.startRunning();
	}

}
