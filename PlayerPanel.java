import javax.swing.*;
import java.awt.FlowLayout;

public class PlayerPanel extends JPanel {
    private JLabel playerNameLabel;
    private JLabel playerLevelLabel;
    private JLabel playerDollarsLabel;

    public PlayerPanel(Player player) {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        playerNameLabel = new JLabel("Joueur : " + player.getName());
        playerLevelLabel = new JLabel("Niveau : " + player.getLevel());
        playerDollarsLabel = new JLabel("Pokédollars : " + player.getPokedollars());
        
        add(playerNameLabel);
        add(playerLevelLabel);
        add(playerDollarsLabel);
    }

    // Méthodes pour mettre à jour les informations du joueur
    public void updatePlayerInfo(Player player) {
        playerNameLabel.setText("Joueur : " + player.getName());
        playerLevelLabel.setText("Niveau : " + player.getLevel());
        playerDollarsLabel.setText("Pokédollars : " + player.getPokedollars());
    }
}