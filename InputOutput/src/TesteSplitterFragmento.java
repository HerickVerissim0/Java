import java.io.IOException;

public class TesteSplitterFragmento {
    public static void main(String[] args) {
        String nomeArquivo = args[0];
        int tamanhoFragmentoKb = Integer.parseInt(args[1]);
        Splitter splitter = new Splitter(nomeArquivo);
        try {
            int qtfFragmentos = splitter.split(tamanhoFragmentoKb*1024);
            System.out.println("quantidade de fragmentos gerados:" + qtfFragmentos);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}