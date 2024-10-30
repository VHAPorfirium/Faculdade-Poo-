package ExemploSala2;

import java.util.Scanner;

public class testeExemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a matricula do aluno: ");
        int matricula = sc.nextInt();

        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        Exemplo2_Aluno aluno = new Exemplo2_Aluno( nome, matricula, ano);

        System.out.println();
        sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Codigo: ");
        int codigo = sc.nextInt();

        Exemplo2_Curso curso1 = new Exemplo2_Curso(curso, codigo);

        System.out.println();

        System.out.println(aluno);
        System.out.println(curso1);

        sc.close();

    }
}
