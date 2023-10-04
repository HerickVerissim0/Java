import java.util.Date;

public class Teste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNomePessoa("Fulano");
        p.setDataNascimento(new Date());

        Veiculo v = new Veiculo();
        v.setModelo("fusca");
        v.setDataFabricacao(new Date());

        Teste teste = new Teste();
        teste.imprimeDados(p);
        teste.imprimeDados(v);

        Filho f = new Filho();
        f.setNome("filho");
        Pai pai = new Pai();
        pai.setNome("pai");
        Avo avo = new Avo();
        avo.setNome("vo");

        teste.imprimeDados(f);
        teste.imprimeDados(pai);
        teste.imprimeDados(avo);
    }

    public void imprimeDados(TesteInterface cl) {
        System.out.println(cl.getTesteNome());
        System.out.println(cl.getTesteData());
    }

    public void imprimeDados(Avo obj) {
        System.out.println(obj.getNome());
    }

/*
    public int calcIdade(TesteInterface cl) {
        return data atual - cl.getTesteData();
    }
*/


}
