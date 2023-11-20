import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyJPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.drawString("Hello World", 20, 30);
    }
}
