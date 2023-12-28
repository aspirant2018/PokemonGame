public class Case {
    private int x, y; // Position de la case
    private CaseType type; // Type de la case (chemin, tour, obstacle, etc.)

    public Case(int x, int y, CaseType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    // Méthodes pour obtenir et définir le type de la case
    public CaseType getType() {
        return type;
    }

    public void setType(CaseType type) {
        this.type = type;
    }
    
    // pour obtenir la position de la case 
    public int getX() {
    	return x;
    }
    
    public int getY() {
    	return y;
    }
    
}