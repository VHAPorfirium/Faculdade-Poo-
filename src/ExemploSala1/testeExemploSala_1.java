package ExemploSala1;

import java.util.Scanner;

public class testeExemploSala_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Nota 1: ");
        float nota1 = sc.nextFloat();

        System.out.print("Nota 2: ");
        float nota2 = sc.nextFloat();

        System.out.print("Nota 3: ");
        float nota3 = sc.nextFloat();

        ExemploSala1 exemploSala1 = new ExemploSala1(nome, nota1, nota2, nota3);

        System.out.println("Media = " + exemploSala1.calcularMedia());

    }
}
