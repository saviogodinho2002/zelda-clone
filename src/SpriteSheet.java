import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	public static BufferedImage spriteSheet;
	public static BufferedImage playerFront,playerBack,playerLeft,playerRight;
	public static BufferedImage wallTile;
	public static BufferedImage enemyFront;
	public SpriteSheet() {
		try {
			spriteSheet = ImageIO.read(this.getClass().getResource("/spritesheet.png"));
		} catch (IOException error) {
			
			
		}
		playerFront = this.getSprite(71, 11, 16, 16);
		playerBack = this.getSprite(1, 11, 16, 16); 
		playerRight = this.getSprite(35, 11, 16, 16);
		
		playerLeft= playerRight;
		
		AffineTransform  affineTransform = AffineTransform.getScaleInstance(-1, 1);
		affineTransform.translate(-16, 0);
		AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		
		playerLeft = affineTransformOp.filter(playerLeft, null);
		
		wallTile = this.getSprite(283, 238, 16, 16);
		
		enemyFront = this.getSprite(316, 237, 16, 16);
		
		
	}
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spriteSheet.getSubimage(x, y, width, height);
		
	}
	public static  BufferedImage getSpriteSheet() {
		return spriteSheet;
	}
	public static void setSpriteSheet(BufferedImage spriteSheet) {
		spriteSheet = spriteSheet;
	}
	public  static BufferedImage getPlayerFront() {
		return playerFront;
	}
	public static void setPlayerFront(BufferedImage playerFront) {
		playerFront = playerFront;
	}
	
	
	
}
