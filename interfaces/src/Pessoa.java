import java.util.Date;

public class Pessoa implements TesteInterface {

    private Date dataNascimento;

    private String nomePessoa;

    public Pessoa() {
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    @Override
    public Date getTesteData() {
        return getDataNascimento();
    }

    @Override
    public String getTesteNome() {
        return getNomePessoa();
    }
}
