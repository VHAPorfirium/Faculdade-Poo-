package Exercicio6;

import java.util.Scanner;

public class alunoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        Alunos aluno = new Alunos(nome);

        System.out.println("Termine a matricula: ");

        System.out.print("Matricula: ");
        int matricula = sc.nextInt();

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        System.out.print("Curso: ");
        sc.nextLine();
        String curso = sc.nextLine();

        aluno.matricula(matricula, ano, curso);

        System.out.println();

        System.out.println("-------------------------------------");
        System.out.println(aluno);
        System.out.println("-------------------------------------");

        System.out.println();

        System.out.print("Alterar o curso: ");
        String cursoAlterado = sc.nextLine();
        aluno.setCurso(cursoAlterado);

        System.out.println();

        System.out.print("Alterar o ano: ");
        int anoAlterado = sc.nextInt();
        aluno.setAno(anoAlterado);

        System.out.println();

        System.out.println("-------------------------------------");
        System.out.println(aluno);
        System.out.println("-------------------------------------");

        sc.close();

    }
}
