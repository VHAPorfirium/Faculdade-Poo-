package ExemploSala2;

public class Exemplo2_Aluno {

    private String nome;
    private int matricula;
    private int ano;

    Exemplo2_Curso curso;

    Exemplo2_Aluno ( String nome, int matricula, int ano) {

        this.nome = nome;
        this.matricula= matricula;
        this.ano = ano;

    }

    public String getNome() {

        return this.nome;

    }

    public int getMatricula() {
        return this.matricula;
    }

    public int getAno() {
        return this.ano;
    }

    public String toString() {
        return "Nome: " + this.getNome() + "\nMatricula: " + this.getMatricula() + "\nAno: " + this.getAno();
    }


}
