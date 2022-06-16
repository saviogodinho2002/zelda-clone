import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheetPlayer {
	public static BufferedImage spriteSheet;
	public static BufferedImage playerFront,playerBack,playerLeft,playerRight;
	public SpriteSheetPlayer() {
		try {
			spriteSheet = ImageIO.read(this.getClass().getResource("/spritesheet.png"));
		} catch (IOException error) {
			
			
		}
		playerFront = this.getSprite(71, 11, 16, 16);
		playerBack = this.getSprite(1, 11, 16, 16); 
		playerLeft= this.getSprite(35, 11, 16, 16);
		playerRight = this.getSprite(35, 11, 16, 16);
		
		AffineTransform  affineTransform = AffineTransform.getScaleInstance(-1, 1);
		affineTransform.translate(-16, -0);
		AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		
		playerLeft = affineTransformOp.filter(playerLeft, null);
		
		
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
