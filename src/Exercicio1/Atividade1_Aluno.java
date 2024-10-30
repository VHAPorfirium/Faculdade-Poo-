    package Exercicio1;

public class Atividade1_Aluno {
    public String nome;
    public int matricula;
    public double nota1;
    public double nota2;
    public double nota3;

    public Atividade1_Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calculaMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String conceito() {
        if (calculaMedia() >= 7) {
            return " Aprovado";
        }
        else {
            return " Reprovado";
        }
    }

    public String toString() {
        return nome + " (Matrícula - " + matricula + ")";
    }

}