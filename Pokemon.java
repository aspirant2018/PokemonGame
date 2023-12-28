
public class Pokemon {
	
	private String name ;
	private int x,y;
	
	public Pokemon (String name ,int x , int y) {
		this.name = name ; 
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int setX(int x) {
		return this.x = x;
	}
	
	public int setY(int y ) {
		return this.y = y;
	}
}
