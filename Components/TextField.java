import javax.swing.*;
import java.awt.*;

public class TextField extends JFrame{

    public TextField(){

        super("Text TextField");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = this.getContentPane();

        JTextField textField = new JTextField();

        c.add(textField);

        setSize(275, 100);

        setVisible(true);
    }

    public static void main(String[] args) {
        TextField t = new TextField();
    }
}



