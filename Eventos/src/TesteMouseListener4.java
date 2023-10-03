import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TesteMouseListener4 extends JFrame {
    private JLabel lTexto = new JLabel("Texto inicial");

    public TesteMouseListener4(String tituloJanela) {
        super(tituloJanela);
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        JButton b1 = new JButton("Botão");
        p1.add(b1);
        p1.add(lTexto);
        c.add(p1);
        b1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                lTexto.setText("Mouse clicked inner");
                System.out.println("Moused clicked inner");

            }
        });
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        TesteMouseListener4 frame = new TesteMouseListener4("TesteMouseListener");
    }
}