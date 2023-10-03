import javax.swing.*;
import java.awt.*;



public class FrameSwingl extends JFrame {
    public FrameSwingl(){
        super("Janela Swing");
        setSize(275, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel(("Text test"));
        Container c = this.getContentPane();
        c.add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        FrameSwingl t = new FrameSwingl();
    }
}
