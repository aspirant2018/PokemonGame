import java.util.ArrayList;

public class PokemonEnnemi extends Pokemon {
	private int healthPoints;
	private int movementSpeed;
	private boolean isDead;
	private int pokedollarsCollected;
	
	
	
	
	
	public PokemonEnnemi(String Name,int x ,int y ,int healthPoints,int movementSpeed,int pokedollarsCollected) {
		
		super(Name,x,y);
		this.healthPoints = healthPoints;
		this.movementSpeed = movementSpeed;
		this.isDead = false;
		this.pokedollarsCollected = pokedollarsCollected;
	}
	
	public void move(ArrayList chemin) {
		
		int taille = chemin.size();
		
		for (int i=0;i<taille;i++) {
			Case c = (Case) chemin.get(i);
			int x = c.getX();
			int y = c.getY();
			this.setX(x);
			this.setY(y);
			
			System.out.println("nouvelle position X "+this.getX());
			System.out.println("nouvelle position Y "+this.getY());
			
		}
		
		
		
		
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}
	
	public int setHealthPoints(int n) {
		return this.healthPoints = n;
	}
}
