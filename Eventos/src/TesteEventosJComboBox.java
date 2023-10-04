import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class TesteEventosJComboBox extends JFrame {
    private JComboBox seletorBancos = new JComboBox();
    private JTextField tfBanco = new JTextField();

    public static void main(String[] args) {
        TesteEventosJComboBox t = new TesteEventosJComboBox();
    }
    public TesteEventosJComboBox(){
        super("Teste Eevento comboBox");
        Container c = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setLayout(new GridLayout(2, 1));
        seletorBancos.addItem("Bradesco");
        seletorBancos.addItem("itau");
        seletorBancos.addItem("globalcode");

        seletorBancos.addActionListener(new SeletorBancosHandler());
        c.add(seletorBancos);
        c.add(tfBanco);
        setSize(275, 100);
        setVisible(true);
    }
    class SeletorBancosHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.out.println("Item selecionado:"+seletorBancos.getSelectedItem());
            tfBanco.setText(seletorBancos.getSelectedItem().toString());
        }
    }
}
