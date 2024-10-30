package ExemploSala2;

import java.util.Scanner;

public class testeExemplo2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a matricula do aluno: ");
        int matricula = sc.nextInt();

        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        Exemplo2_Aluno aluno = new Exemplo2_Aluno(nome, matricula, ano);

        System.out.println();
        sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        System.out.print("Codigo: ");
        int codigo = sc.nextInt();

        Exemplo2_Curso curso1 = new Exemplo2_Curso(curso, codigo);

        System.out.println();

        System.out.println("Informações do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Ano: " + aluno.getAno());

        System.out.println("\nInformações do Curso:");
        System.out.println("Curso: " + curso1.getNome());
        System.out.println("Código: " + curso1.getCodigo());

        sc.close();

    }
}
