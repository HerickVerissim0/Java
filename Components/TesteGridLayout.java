import com.sun.org.apache.bcel.internal.util.Args;
import javax.swing.*;
import java.awt.*;

public class TesteGridLayout extends JFrame {
    public TesteGridLayout() {
        super("Teste Grid Layout");
        Container c = getContentPane();
        this.setSize(700, 225);

        c.setLayout(new BorderLayout());

        JPanel pCoisa = new JPanel();{

            JPanel pBotoes = montaJPanelBotoes();
            JPanel pLogin = montaJPanelLogin();

            pCoisa.add(new JLabel("Border Layout na posição North"), BorderLayout.NORTH);
            pCoisa.add(pLogin);
            pCoisa.add(pBotoes, BorderLayout.SOUTH);
            pCoisa.add(pBotoes, BorderLayout.CENTER);
            c.add(pCoisa);
            setVisible(true);
        }
    }
    public JPanel montaJPanelBotoes(){
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton bSalvar = new JButton(("SALVAR"));
        p.add(bSalvar);
        JButton bExcluir = new JButton(("EXCLUIR"));
        p.add(bExcluir);
        return p;
    }
    public JPanel montaJPanelLogin() {
        JPanel p = new JPanel();
        JTextField tfNumerConta = new JTextField("", 10);
        JTextField tfAgencia = new JTextField("", 10);
        JTextField tfBanco = new JTextField("", 10);
        JTextField tfLimite = new JTextField("", 10);
        JTextField tfcorrentista = new JTextField("", 30);

        p.setLayout(new GridLayout(5, 2));


        p.add(new JLabel("Número da Conta"));
        p.add(tfNumerConta);
        p.add(new JLabel("Agencia"));
        p.add(tfAgencia);
        p.add(new JLabel("Banco"));
        p.add(tfBanco);
        p.add(new JLabel("Limite"));
        p.add(tfLimite);
        p.add(new JLabel("Correntista"));
        p.add(tfcorrentista);

        return p;
    }
        public static void main(String[] args) {
            TesteGridLayout t = new TesteGridLayout();
        }
}