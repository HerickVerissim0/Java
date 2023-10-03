import javax.swing.*;
import java.awt.*;

public class TesteFlowLayout extends JFrame {

    public TesteFlowLayout(){

        super("Text TesteFlowLayout");

        Container c = this.getContentPane();

        JPanel pBotoes = montaJPanelBotoes();

        c.add(pBotoes);

        setSize(275, 100);

        setVisible(true);
    }
    public JPanel montaJPanelBotoes(){
    JPanel p = new JPanel();
    p.setLayout(new FlowLayout(FlowLayout.RIGHT));
    p.add(new JButton("SALVAR"));
    p.add(new JButton("EXCLUIR"));
    return p;
    }

    public static void main(String[] args) {
        TesteFlowLayout t = new TesteFlowLayout();
    }
}