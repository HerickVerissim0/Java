import java.awt.*;

public class Frame1 extends Frame{
    public Frame1 (String title){
        setTitle(title);
        setSize(200, 100);

        Label teste_label = new Label("Teste Label");
        add(teste_label);

        setVisible(true);
    }
}