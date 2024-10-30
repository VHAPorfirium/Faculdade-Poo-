package Exercicio6;

public class AlunosQuestao2 {

    private String nome;
    private int matricula;
    private int ano;
    private String curso;


    AlunosQuestao2(String nome){
        this.nome = nome;
    }

    public void matricula(int matricula, int ano , String curso){
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return "Aluno: " + nome + "\nMatricula: " + matricula + "\nCurso: " + curso + "\nAno: " + ano;
    }


}
