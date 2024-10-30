package Exercicio7;

public class Responsavel {

    private String nome;
    private int telefone;

    public Responsavel(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome do responsavel: " + getNome() + "\nTelefone: " + getTelefone();
    }

}
