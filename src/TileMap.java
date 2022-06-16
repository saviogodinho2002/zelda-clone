import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class TileMap {
	private List<Tile> tileList;
	public TileMap() {
		tileList = new ArrayList<>();
		
		for(int iterator = 0; iterator < 15; iterator++) {
			tileList.add(new Tile(32*iterator, 0));
		}
		
		for(int iterator = 0; iterator < 15; iterator++) {
			tileList.add(new Tile(0, 32*iterator));
		}
		
		for(int iterator = 0; iterator < 15; iterator++) {
			tileList.add(new Tile(32*iterator, 480-32));
		}
		
		for(int iterator = 0; iterator < 15; iterator++) {
			tileList.add(new Tile(480-32, 32*iterator));
		}
		
		
	}
	public boolean isFree(int playerX, int playerY,Player player) {
		// TODO Auto-generated method stub
		for (Tile tile : tileList) {
			if(tile.intersects(new Rectangle(playerX,playerY,player.width,player.height)))
				return false;
		}
		return true;

	}
	public void render(Graphics graphics) {
		for (Tile tile : tileList) {
			tile.render(graphics);
		}
		
	}
	public void tick() {
		
	}
	public List<Tile> getTileList() {
		return tileList;
	}
	public void setTileList(List<Tile> tileList) {
		this.tileList = tileList;
	}
	
}
