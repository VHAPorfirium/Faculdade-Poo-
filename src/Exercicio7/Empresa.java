package Exercicio7;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String cnpj;

    private Responsavel responsavel;

    private ArrayList<Produto> produtos;

    public Empresa(String nome, String cnpj, Responsavel responsavel) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public String toString() {
        String retorno = "Empresa: " + getNome() + "\n" +
                "CNPJ: " + getCnpj() + "\n" +
                responsavel.toString() + "\n";

         if (produtos.isEmpty()) {
            retorno += "Produtos: Nenhum produto cadastrado\n";
        } else {
            retorno += "Produtos:\n";

            for (Produto produto : produtos) {
                retorno += produto.toString() + "\n";
            }
        }

        return retorno;
    }

}
