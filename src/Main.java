import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame();
		
		frame.add(game);
		frame.setTitle("Zeldinha");
		frame.setLocationRelativeTo(null);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		
		Thread thread = new Thread(game);
		
		thread.start();
	}
}
