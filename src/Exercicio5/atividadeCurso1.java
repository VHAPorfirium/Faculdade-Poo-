package Exercicio5;

import java.util.Scanner;

public class atividadeCurso1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================== DADOS DO CURSO 1 ================");
        System.out.print("Nome do curso: ");
        String nomeCurso = sc.nextLine();

        System.out.print("Codigo curso: ");
        String codigoCurso = sc.nextLine();

        System.out.print("Carga Horaria do curso: ");
        int cargaHoraria = sc.nextInt();

        System.out.print("Numero de alunos: ");
        int numeroDeAlunos = sc.nextInt();

        Curso curso = new Curso(nomeCurso, codigoCurso, cargaHoraria, numeroDeAlunos);

        System.out.println();
        sc.nextLine();

        System.out.println("==================== DADOS DO CURSO 2 ================");
        System.out.print("Nome do curso: ");
        nomeCurso = sc.nextLine();

        System.out.print("Codigo curso: ");
        codigoCurso = sc.nextLine();

        System.out.print("Carga Horaria do curso: ");
        cargaHoraria = sc.nextInt();

        System.out.print("Numero de alunos: ");
        numeroDeAlunos = sc.nextInt();

        Curso curso1 = new Curso(nomeCurso, codigoCurso, cargaHoraria, numeroDeAlunos);

        System.out.println();
        sc.nextLine();

        System.out.println("==================== DADOS DO CURSO 3 ================");
        System.out.print("Nome do curso: ");
        nomeCurso = sc.nextLine();

        System.out.print("Codigo curso: ");
        codigoCurso = sc.nextLine();

        System.out.print("Carga Horaria do curso: ");
        cargaHoraria = sc.nextInt();

        System.out.print("Numero de alunos: ");
        numeroDeAlunos = sc.nextInt();

        Curso curso2 = new Curso(nomeCurso, codigoCurso, cargaHoraria, numeroDeAlunos);

        System.out.println();
        sc.nextLine();

        System.out.println("==================== DADOS DO CURSO 4 ================");
        System.out.print("Nome do curso: ");
        nomeCurso = sc.nextLine();

        System.out.print("Codigo curso: ");
        codigoCurso = sc.nextLine();

        System.out.print("Carga Horaria do curso: ");
        cargaHoraria = sc.nextInt();

        System.out.print("Numero de alunos: ");
        numeroDeAlunos = sc.nextInt();

        Curso curso3 = new Curso(nomeCurso, codigoCurso, cargaHoraria, numeroDeAlunos);

        System.out.println();

        System.out.println("==================== DADOS DO CURSO 1 ================");
        System.out.println(curso);
        System.out.println("======================================================");

        System.out.println();

        System.out.println("==================== DADOS DO CURSO 2 ================");
        System.out.println(curso1);
        System.out.println("======================================================");

        System.out.println();

        System.out.println("==================== DADOS DO CURSO 3 ================");
        System.out.println(curso2);
        System.out.println("======================================================");

        System.out.println();

        System.out.println("==================== DADOS DO CURSO 4 ================");
        System.out.println(curso3);
        System.out.println("======================================================");

        sc.close();

    }
}
