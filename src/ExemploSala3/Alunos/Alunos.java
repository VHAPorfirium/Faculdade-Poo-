package ExemploSala3.Alunos;

import java.util.ArrayList;

public class Alunos {

    private String nome;
    private int matricula;
    private int ano;

    public ArrayList<Curso> cursos = new ArrayList<>();

    public Alunos(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void adicionarCurso(Curso curso){

        this.cursos.add(curso);

    }

    public String toString() {
        String auxiliar = "";
        for (Curso curso : cursos) {
            auxiliar = auxiliar + curso.toString() + "\n";
        }
        return "Nome: " + getNome() + "\nMatrícula: " + getMatricula() + "\nAno: " + getAno() + "\nCursos:\n" + auxiliar;
    }


}
