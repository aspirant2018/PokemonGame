import java.awt.Component;
import java.util.ArrayList;

public class Game{
    public static void main(String[] args) {
        Map ourMap = new Map(20,20);
        Player player = new Player();
        GameWindow window = new GameWindow(ourMap,player);
        
        // récupérer les coordonneés de la premiere case du chemin
        ArrayList<Case> chemin = new ArrayList<>();
        chemin = ourMap.getChemin();
        Case debut = (Case) chemin.get(0);
        
        
        //placer le Pokemon Ennemi dans la premiere case de depart ici (0,17)
        PokemonEnnemi E = new PokemonEnnemi("Miouth",debut.getX(),debut.getY(),100,10,10);
        
        // le Pokemon Ennemi avance dans son chemin 
        E.move(chemin);
        
}
}