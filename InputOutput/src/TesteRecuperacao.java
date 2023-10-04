import java.io.FileInputStream;
import java.io.IOException;

public class TesteRecuperacao {
    public static void main(String[] args) {
        FileInputStream leitor = null;
        try {
            leitor = new FileInputStream("dados.dat");
            int ultimaLeitura = 0, i = 0;
                //EOF :  read() = -1
            while ((ultimaLeitura = leitor.read()) != -1){
                byte b = (byte) ultimaLeitura;
                i++;
                System.out.println("byte" + i +":" + b);
            }
            leitor.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
}
