import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteGravadorDados {
    public static void main(String[] args)throws IOException {

        GravadorDados gd = new GravadorDados("c:/temp/teste.dat");

        String texto = "Hoje é um bom dia para testar os streams do java";

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yy HH:mm");

        gd.gravarStringUTF(formatador.format(new Date()));

        float[] dadosFloat = {1341.202F, 12.239F, -914.5085F, 1175.8759F};
        gd.gravarArrayFloat(dadosFloat);

        short[]dadosShort = {1015, 2316, -1788, 4118, -19, 202, 7212};

        gd.gravarArrayShort(dadosShort);

        short[] maisDadosShort = {7, 15, -99, 125, -1687};

        gd.gravarArrayShort(maisDadosShort);

        gd.gravarStringUTF("vamos parar por aqui");

        gd.fecharArquivo();
    }
}
