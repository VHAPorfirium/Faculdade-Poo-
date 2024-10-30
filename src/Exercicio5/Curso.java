package Exercicio5;

public class Curso {

   public String nomeCurso;
   public String codigoCurso;
   public int cargaHoraria;
   public int numeroDeAlunos;

    public Curso(String nomeCurso, String codigoCurso, int cargaHoraria, int numeroDeAlunos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.cargaHoraria = cargaHoraria;
        this.numeroDeAlunos = numeroDeAlunos;
    }

    public String toString() {

        return "Nome do curso: " + this.nomeCurso + "\nCodigo curso: " + this.codigoCurso + "\nCarga horaria do curso: " + this.cargaHoraria + " Horas" + "\nNumero de alunos: " + this.numeroDeAlunos + " Alunos";

    }

}