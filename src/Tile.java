import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Tile extends Rectangle{
	 public Tile(int tileX, int tileY) {
		super(tileX,tileY,32,32);
		 
	}
	 public void render(Graphics graphics) {
		 graphics.drawImage(SpriteSheet.wallTile,this.x,this.y, this.width,this.height,null);
		  
	 }
	 public void tick() {
		 
	 }

}
