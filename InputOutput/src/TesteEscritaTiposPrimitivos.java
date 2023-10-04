import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteEscritaTiposPrimitivos {
    public static void main(String[] args) throws IOException {
        byte b = 1;
        short s = 12;
        int i = 656;
        long l = 5566l;
        float f = 451.0F;
        double d = 1241.0;

        String nomeArq = "tiposPrimitivos.dat";
        //para dar erro -> StringnomeArq="z:/tiposPrimitivos.txt"
        FileOutputStream escritoArquivos = null;
        DataOutputStream escritorTiposPrimitivos = null;

        try {
            System.out.println("enviando dados para arquivo" + nomeArq);
            escritoArquivos = new FileOutputStream(nomeArq);
            escritorTiposPrimitivos = new DataOutputStream(escritoArquivos);
            escritorTiposPrimitivos.writeByte(b);
            escritorTiposPrimitivos.writeShort(s);
            escritorTiposPrimitivos.writeInt(i);
            escritorTiposPrimitivos.writeLong(l);
            escritorTiposPrimitivos.writeFloat(f);
            escritorTiposPrimitivos.writeDouble(d);

            escritorTiposPrimitivos.flush();
        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado" + nomeArq);
        }
        catch (IOException e){
            System.out.println("Problemas com escrita de primitivos em arquivos");
            e.printStackTrace();
        }
        finally {
            if(escritorTiposPrimitivos!=null) escritorTiposPrimitivos.close();
        }
    }
}
