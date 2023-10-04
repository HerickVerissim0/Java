import java.io.FileOutputStream;
import java.io.IOException;

public class TesteGravacao {
    public static void main(String[] args) {
        byte[] dados = {19,76,75,-120,-44};
        FileOutputStream gravador = null;
        try {
            gravador = new FileOutputStream("dados.dat");
            for (int i = 0; i < dados.length; i++){
                byte b = dados[i];
                gravador.write(b);
            }
            gravador.close();
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
