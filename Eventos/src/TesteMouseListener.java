import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteMouseListener extends JFrame {
    public TesteMouseListener(String tituloJanela) {
        super(tituloJanela);
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        JButton b1 = new JButton("Botão 1");
        p1.add(b1);
        c.add(p1);
        EventoMouse listener = new EventoMouse();
        b1.addMouseListener(listener);
        setSize(200, 200);
        show();
    }
        public static void main(String args[]){
            TesteMouseListener frame = new TesteMouseListener("TesteMouseListener");

    }

}
