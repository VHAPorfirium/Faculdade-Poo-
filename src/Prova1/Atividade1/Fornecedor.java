package Prova1.Atividade1;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {

    private String nome;
    private Endereco endereco;
    private List<Produto> produtos;

    public Fornecedor(String nome, Endereco enderecoFornecedor) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}


