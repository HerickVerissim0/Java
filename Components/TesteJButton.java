import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class TesteJButton extends JFrame {
    public TesteJButton(){
        super("Test Button");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = this.getContentPane();

        ImageIcon iconeBotao = new ImageIcon("resources/duke.jpg");


        JButton botaoIcone = new JButton(iconeBotao);

        botaoIcone.setBackground(Color.WHITE);

        c.add(botaoIcone);

        //botaoIcone.setMnemonic(KeyEvent.VK_O);

        setSize(200,100);

        setVisible(true);
    }



    public static void main(String[] args) {
        TesteJButton t = new TesteJButton();
    }
}

