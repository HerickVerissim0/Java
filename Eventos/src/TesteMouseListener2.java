import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;

public class TesteMouseListener2 extends JFrame implements MouseListener{
    private JLabel lTexto = new JLabel("Texto inicial");

    public TesteMouseListener2(String tituloJanela) {
        super(tituloJanela);
        Container c = getContentPane();

        JPanel P1 = new JPanel();

        JButton b1 = new JButton("Botão 1");

        P1.add(b1);

        P1.add(lTexto);

        c.add(P1);

        b1.addMouseListener(this);
        setSize(200, 200);

        setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        lTexto.setText(("MousePressed "));
        System.out.println("MousePressed");
    }

    public void mouseClicked(MouseEvent e) {
        lTexto.setText(("mouseClicked"));
        System.out.println("mouseClicked");
    }

    public void mouseEntered(MouseEvent e) {
        lTexto.setText(("mouseEntered"));
        System.out.println("mouseEntered");
    }

    public void mouseReleased(MouseEvent e) {
        lTexto.setText(("mouseReleased"));
        System.out.println("mouseReleased");
    }

    public void mouseExited(MouseEvent e) {
        lTexto.setText(("mouseExited"));
        System.out.println("mouseExited");
    }

    public static void main(String args[]) {
        TesteMouseListener2 frame = new TesteMouseListener2("TesteMouseListener2");
    }
}