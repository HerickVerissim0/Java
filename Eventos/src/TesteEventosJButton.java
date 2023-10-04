import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class TesteEventosJButton extends JFrame {
    private JButton botao1 = new JButton("Boatao 1");
    private JButton botao2 = new JButton("Botao 2");
    private JLabel lTexto = new JLabel ("AÇÃO");

    public TesteEventosJButton(){
        super("Teste de eventos JButtom");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 1));

        botao1.setMnemonic((KeyEvent.VK_1));
        botao2.setMnemonic((KeyEvent.VK_2));

        botao1.addActionListener(new BotaoHandler());
        botao2.addActionListener(new BotaoHandler());

        c.add(botao1, BorderLayout.NORTH);
        c.add(lTexto, BorderLayout.CENTER);
        c.add(botao2, BorderLayout.SOUTH);

        setSize(275, 100);
        setVisible(true);
    }
    class BotaoHandler implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            System.out.println("Botao ativado:" + e.getActionCommand());
            lTexto.setText("Botao ativado" + e.getActionCommand());
        }
    }

    public static void main(String[] args) {
        TesteEventosJButton t = new TesteEventosJButton();
    }
}
