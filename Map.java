import java.util.ArrayList;

public class Map {
    private int width, height;
    private Case[][] mapGrid;
    private  ArrayList<Case> chemin = new ArrayList<>();

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.mapGrid = new Case[height][width]; // Utilisez 'this' pour faire référence au champ de la classe
        initializeMap();
        setPath(0, 17, 8, 17);   // Chemin de [0,17] à [8,17]
        setPath(8, 17, 8, 7);   // Chemin de [8,17] à [8,7]
        setPath(8, 7, 16, 7);   // Chemin de [8,7] à [16,7]
        setPath(16, 7, 16, 3);  // Chemin de [16,7] à [16,3]
    }

    private void initializeMap() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                CaseType type = CaseType.FREE; // Assurez-vous que NOPATH est bien défini dans votre enum
                this.mapGrid[y][x] = new Case(x, y, type); // Ici encore, 'this' clarifie que vous faites référence au champ de la classe
            }
        }
    }


    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public Case getCaseAt(int y, int x) {
        return mapGrid[y][x];
    }
    
    public ArrayList getChemin() {
		return chemin;
    	
    }
 

    public void setPath(int startX, int startY, int endX, int endY) {
        if (startX < 0 || startY < 0 || endX >= width || endY >= height) {
            throw new IllegalArgumentException("Coordonnées de chemin invalides.");
        }
    
        if (startX == endX) {
            // Chemin vertical
            int minY = Math.min(startY, endY);
            int maxY = Math.max(startY, endY);
            
            for (int y = minY; y <= maxY; y++) {
            	
                mapGrid[y][startX].setType(CaseType.PATH);
                chemin.add(mapGrid[y][startX]);
                
            }
        } else if (startY == endY) {
            // Chemin horizontal
            int minX = Math.min(startX, endX);
            int maxX = Math.max(startX, endX);
            
            for (int x = minX; x <= maxX; x++) {
                mapGrid[startY][x].setType(CaseType.PATH);
                chemin.add(mapGrid[startY][x]);
            }
        } else {
            throw new IllegalArgumentException("Les chemins diagonaux ne sont pas pris en charge.");
        }
    }
    
}