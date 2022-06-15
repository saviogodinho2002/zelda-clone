import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Tile extends Rectangle{
	 public Tile(int x, int y) {
		super(x,y,32,32);
		 
	}
	 public void render(Graphics graphics) {
		 graphics.setColor(Color.CYAN);
		 graphics.fillRect(this.x, this.y, this.width, this.height);
		  
	 }
	 public void tick() {
		 
	 }

}
