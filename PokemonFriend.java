
public class PokemonFriend extends Pokemon {
	
	private int attackPoints;
	private int attackRange;
	private int attackSpeed;
	private int price;


	public PokemonFriend(String name, int x, int y,int attackPoints,int attackRange,int attackSpeed,int price) {
		super(name, x, y);
		// TODO Auto-generated constructor stub
		
		this.attackPoints = attackPoints ;
		this.attackRange = attackRange;
		this.attackSpeed = attackSpeed ;
		this.price = price;
	}
	
	public void attack(PokemonEnnemi PokemonEnnemi) {
		
		
		int HP = PokemonEnnemi.getHealthPoints();
		HP = HP - attackPoints;
		PokemonEnnemi.setHealthPoints(HP);
		
	}
}