package Prova1.Atividade1;

public class Software extends Produto {

    private String versao;

    public Software(String descricao, double preco, int ano, String versao) {
        super(descricao, preco, ano);
        this.versao = versao;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    @Override
    public String getDetalhes() {
        return "Software: " + getDescricao() + ", Versão: " + versao;
    }
}
