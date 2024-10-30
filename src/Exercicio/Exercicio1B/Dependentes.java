package Exercicio.Exercicio1B;

public class Dependentes {

    private String nome;
    private char sexo;

    public Dependentes(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return nome + " - " + sexo;
    }
}
