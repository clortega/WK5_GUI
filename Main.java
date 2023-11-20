import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "Hello World");

        // System.out.println("No Frame:" + JFrame.getFrames());S
        // JFrame window = new JFrame();
        // window.setVisible(true);
        // JFrame window2 = new JFrame();S
        // window2.setVisible(true);
        // System.out.println("Two Frames: " + JFrame.getFrames()); 
        
        JFrame window = new JFrame();
        window.setSize(500, 500); //determines size of the window
        window.setLocation(200, 200); //determines the location it appears when its opened
        window.setVisible(true);

        TestJFrame test = new TestJFrame();
    }
}