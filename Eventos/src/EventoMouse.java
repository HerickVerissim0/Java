import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventoMouse implements MouseListener {

    public void mouseClicked(MouseEvent e) {
        System.out.println("MousePressed");
    }


    public void mousePressed(MouseEvent e) {
        System.out.println("MouseReleased");
    }


    public void mouseReleased(MouseEvent e) {
        System.out.println("MouseEntered");
    }


    public void mouseEntered(MouseEvent e) {
        System.out.println("MouseExited");
    }


    public void mouseExited(MouseEvent e) {
        System.out.println("MouseClicked");
    }
}
