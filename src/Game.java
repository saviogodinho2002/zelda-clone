import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener{

	public static int WIDTH = 480, HEIGHT = 480;
	
	private Graphics graphics;
	private Player player;
	private TileMap tileMap;
	
	public Game() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		player = new Player(0, 0);
		tileMap = new TileMap();
		
		this.addKeyListener(this);
	}
	
	public void tick() { //verifica estado
		player.tick();
		tileMap.tick();
		
		
		
	}
	public void render() { //desenha estado
		BufferStrategy bufferStrategy = this.getBufferStrategy();
		if(bufferStrategy == null) {
			this.createBufferStrategy(3);
			return;
		}
			
		graphics = bufferStrategy.getDrawGraphics();
		
		
		drawGraphic(0, 0, WIDTH, HEIGHT, Color.black);
		
		
		
		player.render(graphics);
		
		tileMap.render();
		
		bufferStrategy.show();
		
	}
	public void drawGraphic(int positionX, int positionY,int width ,int height, Color color) {
		graphics.setColor(color);
		graphics.fillRect(positionX, positionY, width, height);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Chamando game loop");
			tick();
			render();
			try {
				Thread.sleep(1000/60);
			} catch (InterruptedException e) {
				
			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.setPlayerRight(true);
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.setPlayerLeft(true);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			player.setPlayerDown(true);
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			player.setPlayerUp(true);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.setPlayerRight(false);
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.setPlayerLeft(false);
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			player.setPlayerDown(false);
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			player.setPlayerUp(false);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
