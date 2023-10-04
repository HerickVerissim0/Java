import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GravadorDados {
    private FileOutputStream gravador;
    private BufferedOutputStream gravadorBuffererizado;
    private DataOutputStream gravadorPrimitivos;

    static final byte DADOS_SHORT = 0;
    static final byte DADOS_FLOAT = 1;
    static final byte DADOS_UTF = 2;

    public GravadorDados(String nomeArquivos) throws IOException{
        gravador = new FileOutputStream(nomeArquivos, true);
        gravadorBuffererizado = new BufferedOutputStream(gravador, 1024);
        gravadorPrimitivos = new DataOutputStream(gravadorBuffererizado);
    }
    public void fecharArquivo() throws IOException{
        gravadorPrimitivos.flush();
        gravadorPrimitivos.close();
        gravadorBuffererizado.close();
    }
    public void gravarArrayShort(short[]array)throws IOException {
        gravadorPrimitivos.write(DADOS_SHORT);
        gravadorPrimitivos.writeInt(array.length);
        for (int i = 0; i < array.length; i++){
            gravadorPrimitivos.writeShort(array[i]);
        }
    }
    public void gravarArrayFloat(float[] array) throws IOException{
        gravadorPrimitivos.write(DADOS_FLOAT);
        gravadorPrimitivos.writeInt(array.length);
        for (int i = 0; i < array.length; i++){
            gravadorPrimitivos.writeFloat(array[i]);
        }
    }
    public void gravarStringUTF(String texto) throws IOException{
        gravadorPrimitivos.write(DADOS_UTF);
        gravadorPrimitivos.writeUTF(texto);
    }
}
