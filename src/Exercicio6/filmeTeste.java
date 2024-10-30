package Exercicio6;

import java.util.Scanner;

public class filmeTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         Filme filme = new Filme();

        System.out.print("Deseja começar a cadastrar os filmes? ");
        String opcao = sc.nextLine();

         while (opcao.equalsIgnoreCase("Sim")) {
            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

             filme.adicionarFilme(codigo, nome);

            System.out.print("Gênero: ");
            filme.setGenero(sc.nextLine());

            System.out.print("Ano: ");
            filme.setAno(sc.nextInt());

            sc.nextLine();

            System.out.print("Autor principal: ");
            filme.setAutorPrincipal(sc.nextLine());

            System.out.println();

            System.out.print("Deseja cadastrar outro filme? ");
            opcao = sc.nextLine();

            System.out.println();
        }

        System.out.println(filme);

        System.out.println("Total de filmes cadastrados: " + Filme.getTotalFilmes());

        sc.close();
    }
}
