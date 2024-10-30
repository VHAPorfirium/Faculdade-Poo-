package Exercicio4;

public class Produto {
    public String nomeProduto;
    public int codigo;
    public int quantidade;
    public String tipo;
    public double valorProduto;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nomeProduto = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nomeProduto = nome;
        this.quantidade = quantidade;
    }


    public Produto(int codigo, String nome, int quantidade, String tipo) {
        this.codigo = codigo;
        this.nomeProduto = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nomeProduto = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valorProduto = valor;
    }

    public void vender(int qtd) {
        if (qtd > this.quantidade) {
            System.out.println("Estoque insuficiente.");
        } else {
            quantidade -= qtd;
            System.out.println("Venda realizada! Valor total: R$ " + (qtd * valorProduto));
        }
    }

    public void comprar(int qtd, double novoValor) {
        quantidade += qtd;
        valorProduto = novoValor;
        System.out.println("Compra realizada com alteração de valor.");
    }

    public void comprar(int qtd) {
        quantidade += qtd;
        System.out.println("Compra realizada sem alteração de valor.");
    }

    public void inserir(String nome, int quantidade, String tipo, double valor) {
        this.nomeProduto = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valorProduto = valor;
        System.out.println("Dados do produto atualizados.");
    }


    @Override
    public String toString() {
        return "Codigo: " + this.codigo + "\nProduto: " + nomeProduto + "\nQuantidade em estoque: " + quantidade + "\nTipo: " + tipo + "\nValor: R$ " + valorProduto;
    }

    public boolean igual(Produto outro) {
        return this.nomeProduto.equals(outro.nomeProduto) && this.tipo.equals(outro.tipo);
    }
}


