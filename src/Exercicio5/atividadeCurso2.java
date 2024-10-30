package Exercicio5;

import java.util.Scanner;

public class atividadeCurso2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        String[] nomeCurso = new String[n];
        String[] codigoCurso = new String[n];
        int[] cargaHoraria = new int[n];
        int[] numeroDeAlunos = new int[n];
        Curso[] curso = new Curso[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Nome do curso: ");
            nomeCurso[i] = sc.nextLine();

            System.out.print("Codigo curso: ");
            codigoCurso[i] = sc.nextLine();

            System.out.print("Carga Horaria do curso: ");
            cargaHoraria[i] = sc.nextInt();

            System.out.print("Numero de alunos: ");
            numeroDeAlunos[i] = sc.nextInt();

            sc.nextLine();

            curso[i] = new Curso(nomeCurso[i], codigoCurso[i], cargaHoraria[i], numeroDeAlunos[i]);

            System.out.println();

        }

        for (int i = 0; i < n; i++) {

            System.out.println("==================== DADOS DO CURSO ================");
            System.out.println(curso[i].toString());
            System.out.println("====================================================");

        }

        sc.close();

    }
}
