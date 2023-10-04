import java.io.IOException;

public class TesteSplitterReconstrucao {
    public static void main(String[] args) {
        String nomeArquivo = args[0];
        int qtdFragmentos = Integer.parseInt(args[1]);
        Splitter splitter = new Splitter(nomeArquivo);
        try {
            splitter.putTogheter(qtdFragmentos);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}