import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TesteBufferedInputStream {
    public static void main(String[] args) {
       FileInputStream leitorArquivo = null;
        BufferedInputStream leitorBufferizado = null;
        try{
            leitorArquivo = new FileInputStream("c:/temp/teste.dat");
            leitorBufferizado = new BufferedInputStream(leitorArquivo, 2048);
            int leitura = 0;
            while ((leitura = leitorBufferizado.read()) != -1){
                byte b = (byte) leitura;
                if ((b % 13 == 0) || (b % 17 == 0)){
                    tratamentoEspecial(b);
                }else {
                    tratamentoNormal(b);
                }
            }
            leitorBufferizado.close();
            leitorArquivo.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    static void tratamentoNormal(byte b){
    }
    static void tratamentoEspecial(byte b){
    }
}
