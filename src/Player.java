import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle {
	private int playerWidth, playerHeight;
	private boolean playerRight, playerLeft, playerDown, playerUp;
	private int playerPositionX, playerPositionY;
	
	private int playerSpeed;

	public Player(int positionX, int positonY) {
		super(positionX, positonY,32,32	);
		playerPositionX = positionX;
		playerPositionY = positonY;
		playerWidth = 32;
		playerHeight = 32;
		playerSpeed = 4;
		
		
		
	}

	public void tick() {
		if(playerRight) {
			playerPositionX+= playerSpeed;
		}else if(playerLeft) {
			playerPositionX -= playerSpeed;
		}
		
		if(playerDown) {
			playerPositionY += playerSpeed;
		}else if(playerUp) {
			playerPositionY -= playerSpeed;
		}

	}

	public void render(Graphics graphics) {
		graphics.setColor(Color.blue);
		graphics.fillRect(playerPositionX, playerPositionY, playerWidth, playerHeight);

	}

	public int getPlayerWidth() {
		return playerWidth;
	}

	public void setPlayerWidth(int playerWidth) {
		this.playerWidth = playerWidth;
	}

	public int getPlayerHeight() {
		return playerHeight;
	}

	public void setPlayerHeight(int playerHeight) {
		this.playerHeight = playerHeight;
	}

	public boolean isPlayerRight() {
		return playerRight;
	}

	public void setPlayerRight(boolean playerRight) {
		this.playerRight = playerRight;
	}

	public boolean isPlayerLeft() {
		return playerLeft;
	}

	public void setPlayerLeft(boolean playerLeft) {
		this.playerLeft = playerLeft;
	}

	public boolean isPlayerDown() {
		return playerDown;
	}

	public void setPlayerDown(boolean playerDown) {
		this.playerDown = playerDown;
	}

	public boolean isPlayerUp() {
		return playerUp;
	}

	public void setPlayerUp(boolean playerUp) {
		this.playerUp = playerUp;
	}

	public int getplayerSpeed() {
		return playerSpeed;
	}

	public void setplayerSpeed(int playerSpeed) {
		this.playerSpeed = playerSpeed;
	}
	
	

}
