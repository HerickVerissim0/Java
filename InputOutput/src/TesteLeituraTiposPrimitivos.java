import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteLeituraTiposPrimitivos {
    public static void main(String[] args) throws IOException {
        String nomeArq = "tiposPrimitivos.dat";
        FileInputStream leitorArquivos = null;
        DataInputStream leitorTiposPrimitivos = null;
        try{
            leitorArquivos = new FileInputStream(nomeArq);

            leitorTiposPrimitivos = new DataInputStream(
                    leitorArquivos);

            byte b = leitorTiposPrimitivos.readByte();
            short s = leitorTiposPrimitivos.readShort();
            int i = leitorTiposPrimitivos.readInt();
            long l = leitorTiposPrimitivos.readLong();
            float f = leitorTiposPrimitivos.readFloat();
            double d = leitorTiposPrimitivos.readDouble();

            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
        } catch (FileNotFoundException e){
            System.out.println("Arquivo nao escontrado" + nomeArq);
        } catch (IOException e) {
            System.out.println("Problemas com escritas primitivos em arquivo");
            e.printStackTrace();
        }
        finally {
            if (leitorTiposPrimitivos!=null) leitorTiposPrimitivos.close();
        }
    }
}
