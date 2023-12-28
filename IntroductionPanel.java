import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IntroductionPanel extends JPanel {
    private BufferedImage introImage;

    public IntroductionPanel() {
        setLayout(new BorderLayout());

        // Chargez l'image d'introduction
        try {
            introImage = ImageIO.read(new File("intro_pic.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ajoutez un MouseListener pour détecter les clics de souris
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                // Vérifiez si le clic est dans la zone souhaitée
                if (x >= 300 && x <= 500 && y >= 530 && y <= 560) {
                    // Affichez une boîte de dialogue pour demander le nom du joueur
                    String playerName = JOptionPane.showInputDialog("Entrez votre nom :");
                    // À ce stade, vous pouvez démarrer la nouvelle partie avec le nom du joueur
                    // Créez la carte, le panneau du joueur, etc.
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dessinez l'image d'introduction
        g.drawImage(introImage, 0, 0, this);
    }
}