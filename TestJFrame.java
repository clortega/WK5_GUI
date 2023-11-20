import javax.swing.JFrame;


public class TestJFrame extends JFrame {
    public TestJFrame() {
        super("GUI Test");
        setContentPane(new MyJPanel());
        setSize(600,600);
        setLocation(800, 200);
        setVisible(true);

    }
}
