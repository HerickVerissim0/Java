import java.util.Date;

public class Avo implements TesteInterface {

    private String nome;

    public Avo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Date getTesteData() {
        return null;
    }

    @Override
    public String getTesteNome() {
        return nome;
    }
}
