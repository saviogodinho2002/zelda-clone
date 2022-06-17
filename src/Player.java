import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class Player extends Rectangle {
	private int playerWidth, playerHeight;
	private boolean playerRight, playerLeft, playerDown, playerUp;
	
	
	private int playerSpeed;
	private BufferedImage currentPlayerSprite;
	

	public Player(int positionX, int positonY) {
		super(positionX, positonY,32,32	);
		currentPlayerSprite = SpriteSheet.playerFront;
		playerSpeed = 4;
	}

	public void tick(TileMap tileMap) {
		if(playerRight && tileMap.isFree(this.x  + this.playerSpeed, this.y, this)) {
			
			this.x += playerSpeed;
		}else if(playerLeft && tileMap.isFree(this.x  - this.playerSpeed, this.y, this)) {
			
			this.x -= playerSpeed;
		}
		
		if(playerDown && tileMap.isFree(this.x  , this.y + this.playerSpeed, this)) {
			
			this.y += playerSpeed;
		}else if(playerUp && tileMap.isFree(this.x  , this.y - this.playerSpeed, this)) {
			this.y -= playerSpeed;
		}

	}

	public void render(Graphics graphics) {
		//graphics.setColor(Color.blue);
		
		//graphics.fillRect(this.x, this.y, this.width, this.height);
		graphics.drawImage(currentPlayerSprite,this.x,this.y,this.width,this.height,null);
		

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

	public int getPlayerSpeed() {
		return playerSpeed;
	}

	public void setPlayerSpeed(int playerSpeed) {
		this.playerSpeed = playerSpeed;
	}

	public BufferedImage getCurrentPlayerSprite() {
		return currentPlayerSprite;
	}

	public void setCurrentPlayerSprite(BufferedImage currentPlayerSprite) {
		this.currentPlayerSprite = currentPlayerSprite;
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
