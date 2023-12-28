public class Player {
    private String Name;
    private int pokedollars;
    private int level;

    public Player() {
        // Constructeur sans argument
        this.level = 1; // Niveau de départ
        this.pokedollars = 100; // Monnaie initiale
    }

    // Autres méthodes et attributs de la classe Player

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getPokedollars() {
        return pokedollars;
    }

    public int getLevel() {
        return level;
    }
}
