import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Splitter {
    private String nomeArquivo;

    private final static int TAMANHO_MAXIMO = 256 * 1024; //256KB

    public Splitter(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }
    //fragmenta o arquivo em varios pedaços
    public int split(int tamanhoFragmento) throws IOException{
        if (tamanhoFragmento > TAMANHO_MAXIMO){
            tamanhoFragmento = TAMANHO_MAXIMO;
        }
        FileInputStream leitor = null;
        int quantidadeFragmentos = 0;
        int quantidadeBytes = 0;
        byte[] buffer = new byte[tamanhoFragmento];
        try {
            leitor = new FileInputStream(nomeArquivo);
            //leitura de um bloco de bytes
            while ((quantidadeBytes = leitor.read(buffer)) != -1){
                quantidadeFragmentos++;
                gerarFragmento(quantidadeFragmentos, buffer,
                        quantidadeBytes);
                Arrays.fill(buffer, (byte) 0);
            }
            return quantidadeFragmentos;
        }finally {
            if (leitor != null) leitor.close();
        }
    }
    protected void gerarFragmento(int numeroFragmento, byte[] buffer, int qtd)
        throws IOException{
        String nomeFragmento = nomeArquivo + "." + numeroFragmento;
        FileOutputStream gravador = null;
        try {
            gravador = new FileOutputStream(nomeFragmento);
            //escrita de um bloco de bytes
            gravador.write(buffer, 0, qtd);
            gravador.flush();
        }finally {
            if (gravador != null)gravador.close();
        }
    }
    //reconstroi o arquivo a partir de varios pedaços
    public void putTogheter(int quantidadeFragmento)
        throws IOException {
        FileOutputStream gravador = null;
        int numeroFragmento = 0;
        try {
            gravador = new FileOutputStream(nomeArquivo);
            byte[] buffer = new byte[TAMANHO_MAXIMO];
            while (numeroFragmento++ < quantidadeFragmento) {
                int quantidadeBytes = lerFragmento(numeroFragmento, buffer);
                //escrita de um blocod e bytes
                gravador.write(buffer, 0, quantidadeBytes);
                gravador.flush();
                Arrays.fill(buffer, (byte) 0);
            }
        } finally {
            if (gravador != null) gravador.close();
        }
    }
        protected int lerFragmento(int numeroFragmento, byte[] buffer)
        throws IOException{
        String nomeFragmento = nomeArquivo + "." + numeroFragmento;
        FileInputStream leitor = null;
        try {
            leitor=new FileInputStream(nomeFragmento);
            int qtdRecuperada = leitor.read(buffer);//leitura de um bloco de bytes
            return qtdRecuperada;
        }finally {
            if (leitor!=null)leitor.close();
        }
    }
}