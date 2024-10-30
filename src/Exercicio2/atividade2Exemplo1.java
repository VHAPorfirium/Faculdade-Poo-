package Exercicio2;

import java.util.Scanner;

public class atividade2Exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numi = 0, numf = 0;
        int soma = 0;
        double media;
        int qtde = 0;
        int qtdePares = 0;
        int qtdeImpares = 0;

        System.out.println("Entre o primeiro número:");
        numi = sc.nextInt();

        System.out.println("Entre o segundo número:");
        numf = sc.nextInt();

        if (numi > numf) {

            int num = numf;
            numf = numi;
            numi = num;

        }

        for (int i = numi; i < numf + 1; i++) {

            qtde++;
            soma = soma + i;

            if ((i % 2) == 0) {
                qtdePares++;
            }
            else {
                qtdeImpares++;
            }

        }

        System.out.println("Soma : " + soma + " - Média : " + soma / qtde + " - Qtde Pares : "+ qtdePares + " Qtde Ímpares : " + qtdeImpares);

    }
}
