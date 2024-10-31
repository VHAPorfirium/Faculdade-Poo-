package Exercicio8.Exercicio2;

public class CamaroteInferior extends VIP {

    public int localizacao;

    public CamaroteInferior(Double valor, Double valorAdicional, int localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public int getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public int localizacaoIngresso() {
        return getLocalizacao();
    }
}
