
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MapPanel extends JPanel {
    private Map gameMap;
    private Image mapImage;

    public MapPanel(Map gameMap) {
        this.gameMap = gameMap;

        // Chargez l'image de la carte (niveau1b.png)
        mapImage = new ImageIcon("niveau1bgrille.png").getImage();

        // Définissez la taille du MapPanel pour correspondre à la taille de l'image
        setPreferredSize(new Dimension(mapImage.getWidth(null), mapImage.getHeight(null)));

        // Ajoutez l'écouteur de souris ici
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                // Vérifiez que x et y sont dans les limites de la taille de la carte
                if (x >= 0 && x < getWidth() && y >= 0 && y < getHeight()) {
                    // Convertissez les coordonnées du clic en indices de tableau
                    int cellX = (x * gameMap.getWidth()) / getWidth();
                    int cellY = (y * gameMap.getHeight()) / getHeight();

                    // Maintenant, x et y sont les coordonnées dans la taille de l'image
                    Case clickedCase = gameMap.getCaseAt(cellY, cellX);
                    System.out.println("Clicked on case: (" + cellX + ", " + cellY + ") Type: " + clickedCase.getType());
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMap(g);
    }

    private void drawMap(Graphics g) {
        // Dessinez l'image de la carte sans redimensionnement
        g.drawImage(mapImage, 0, 0, this);
    }
}