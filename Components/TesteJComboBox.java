import javax.swing.*;
import java.awt.*;

public class TesteJComboBox extends JFrame {

        public TesteJComboBox(){

            super("Text JCombo Box");

            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            Container c = this.getContentPane();

            JComboBox seletorBancos = new JComboBox();

            seletorBancos.addItem("Herick");
            seletorBancos.addItem("Alisson");
            seletorBancos.addItem("Luiz");

            c.add(seletorBancos);

            setSize(275, 100);

            setVisible(true);
        }

        public static void main(String[] args) {
            TesteJComboBox t = new TesteJComboBox();
        }
    }
