import java.io.Serializable;
import java.util.Date;

public class Veiculo implements TesteInterface, Serializable {

    private String renavam;
    private String modelo;
    private Date dataFabricacao;

    public Veiculo() {
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public Date getTesteData() {
        return getDataFabricacao();
    }

    @Override
    public String getTesteNome() {
        return getModelo();
    }
}




