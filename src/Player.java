import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle {
	private int playerWidth, playerHeight;
	private boolean playerRight, playerLeft, playerDown, playerUp;
	
	
	private int playerSpeed;
	

	public Player(int positionX, int positonY) {
		super(positionX, positonY,32,32	);
		playerSpeed = 4;
	}

	public void tick() {
		if(playerRight) {
			this.x += playerSpeed;
		}else if(playerLeft) {
			this.x -= playerSpeed;
		}
		
		if(playerDown) {
			this.y += playerSpeed;
		}else if(playerUp) {
			this.y -= playerSpeed;
		}

	}

	public void render(Graphics graphics) {
		graphics.setColor(Color.blue);
		
		graphics.fillRect(this.x, this.y, this.width, this.height);

		

	}



	public boolean isPlayerRight() {
		return this.playerRight;
	}

	public void setPlayerRight(boolean playerRight) {
		this.playerRight = playerRight;
	}

	public boolean isPlayerLeft() {
		return this.playerLeft;
	}

	public void setPlayerLeft(boolean playerLeft) {
		this.playerLeft = playerLeft;
	}

	public boolean isPlayerDown() {
		return this.playerDown;
	}

	public void setPlayerDown(boolean playerDown) {
		this.playerDown = playerDown;
	}

	public boolean isPlayerUp() {
		return this.playerUp;
	}

	public void setPlayerUp(boolean playerUp) {
		this.playerUp = playerUp;
	}

	public int getplayerSpeed() {
		return this.playerSpeed;
	}

	public void setplayerSpeed(int playerSpeed) {
		this.playerSpeed = playerSpeed;
	}
	
	

}
