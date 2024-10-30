package Exercicio7;

public class Produto {

    private String nome;
    private int tamanho;
    private String tipo;
    private String cor;
    private String especificacao;

    public Produto(String nome, int tamanho, String tipo, String cor, String especificacao) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
        this.especificacao = especificacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecificacao() {
        return especificacao;
    }
    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public String toString() {
        return "Nome do produto: " + getNome() + "\nTamanho: " + getTamanho() + "\nTipo: " + getTipo() + "\nCor: " + getCor() + "\nEspecificacao: " + getEspecificacao();
    }


}
