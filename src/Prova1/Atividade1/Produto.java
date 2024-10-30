package Prova1.Atividade1;

public class Produto {

    private String descricao;
    private double preco;
    private int ano;
    private Fornecedor fornecedor;

    public Produto(String descricao, double preco, int ano) {
        this.descricao = descricao;
        this.preco = preco;
        this.ano = ano;
    }

    public String getDetalhes() {
        return "Produto: " + descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
