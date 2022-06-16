import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Tile extends Rectangle{
	 public Tile(int tileX, int tileY) {
		super(tileX,tileY,32,32);
		 
	}
	 public void render(Graphics graphics) {
		 graphics.setColor(Color.CYAN);
		 graphics.fillRect(this.x, this.y, this.width, this.height);
		 graphics.setColor(Color.black);
		 graphics.drawRect(this.x, this.y, this.width, this.height);
		  
	 }
	 public void tick() {
		 
	 }

}
