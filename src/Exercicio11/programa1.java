package Exercicio11;

import java.util.Scanner;

public class programa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero: ");
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo numero: ");
            int num2 = sc.nextInt();

            int adicao = num1 + num2;
            int subtracao = num1 - num2;
            int multiplicacao = num1 * num2;
            int divisao = num1 / num2;

            System.out.println(adicao);
            System.out.println(subtracao);
            System.out.println(multiplicacao);
            System.out.println(divisao);
        }
        catch(ArithmeticException e){
            System.out.print("Não pode haver divisão por 0");
        }

        sc.close();
    }
}
