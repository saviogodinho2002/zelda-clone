import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{

	public static int WIDTH = 480, HEIGHT = 480;
	
	public Game() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Chamando game loop");
		}
		
	}
	
	
}
