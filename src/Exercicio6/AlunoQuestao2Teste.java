package Exercicio6;

import java.util.Scanner;

public class AlunoQuestao2Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        Alunos aluno = new Alunos(nome);
        CursoQuestao2 curso = new CursoQuestao2();

        System.out.println("Termine a matricula: ");

        System.out.print("Matricula: ");
        int matricula = sc.nextInt();

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        System.out.print("Curso: ");
        sc.nextLine();
        String curso1 = sc.nextLine();

        System.out.println("Sigla: ");
        String sigla = sc.nextLine();

        aluno.matricula(matricula, ano, curso1);
        curso.CursoQuestao2(sigla, nome);

        System.out.println();

        System.out.println("-------------------------------------");
        System.out.println(aluno);
        System.out.println();
        System.out.println(curso);
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