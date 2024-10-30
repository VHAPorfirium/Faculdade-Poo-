package Exercicio6;

public class CursoQuestao2 {

    private String sigla;
    private String nome;

    AlunosQuestao2 alunos;

    public CursoQuestao2() {

    }

    public void CursoQuestao2(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Sigla: " + this.sigla + "\nNome: " + this.nome;
    }


}
