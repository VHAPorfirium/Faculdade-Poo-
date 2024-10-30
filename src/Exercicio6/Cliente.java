package Exercicio6;

public class Cliente {

    private String nome;
    private String telefone;
    private int idade;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int ano) {
        this.idade = ano;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public int getIdade() {
        return this.idade;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nTelefone: " + telefone + "\nIdade: " + idade;
    }
}
