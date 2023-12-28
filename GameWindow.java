import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameWindow extends JFrame {
    private MapPanel mapPanel;
    private PlayerPanel playerPanel;
    private String playerName;

    public GameWindow(Map gameMap, Player player) {
        // Configuration de la fenêtre principale
        setTitle("Votre Jeu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 640);
        setLayout(new BorderLayout());

        // Création de l'image d'introduction
        JLabel introImageLabel = new JLabel(new ImageIcon("intro_pic.png"));
        introImageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                // Vérifiez si le clic se trouve dans la zone spécifiée
                if (x >= 300 && x <= 500 && y >= 520 && y <= 560) {
                    playerName = JOptionPane.showInputDialog("Entrez votre nom :");
                    if (playerName != null && !playerName.isEmpty()) {
                        // L'utilisateur a saisi un nom valide, vous pouvez le stocker dans une variable
                        // playerName et passer à l'écran de jeu
                        player.setName(playerName);
                        remove(introImageLabel);
                        initializeGame(gameMap, player);
                    }
                }
            }
        });

        add(introImageLabel, BorderLayout.CENTER);

        setLocationRelativeTo(null); // Centre la fenêtre sur l'écran
        setVisible(true);
    }

    private void initializeGame(Map gameMap, Player player) {
        // Créez les panneaux pour la carte et le joueur
        mapPanel = new MapPanel(gameMap);
        playerPanel = new PlayerPanel(player);

        // Créez un séparateur de division (JSplitPane) pour diviser la fenêtre en deux parties
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, mapPanel, playerPanel);
        splitPane.setDividerLocation(600); // Réglez la position du séparateur à 600 pixels à partir de la gauche
        // Désactivez la redimension du séparateur
        splitPane.setEnabled(false);

        // Ajoutez le séparateur de division à la fenêtre
        getContentPane().add(splitPane, BorderLayout.CENTER);

        // Redessinez la fenêtre pour refléter les changements
        revalidate();
        repaint();
    }
}