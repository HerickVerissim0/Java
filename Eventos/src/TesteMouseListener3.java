import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TesteMouseListener3 extends JFrame {
    private JLabel lTexto = new JLabel("Texto inicial");
    public TesteMouseListener3(String tituloJanela) {
        super(tituloJanela);
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        JButton b1 = new JButton("Botão 1");
        p1.add(b1);
        p1.add(lTexto);
        c.add(p1);
        EventoMouse Listener = new EventoMouse();
        b1.addMouseListener(Listener);
        setSize(200, 200);
        setVisible(true);
    }    
    public class EventosMouse extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            lTexto.setText("MouseClicked");
            System.out.println("MouseClicked");
        }
    }
    public static void main(String args[]){
        TesteMouseListener3 frame = new TesteMouseListener3(("teste mouse 3"));
        }
}
