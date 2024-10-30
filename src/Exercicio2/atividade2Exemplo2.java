package Exercicio2;

import java.util.Scanner;

public class atividade2Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numi = 0, numf = 0;

        System.out.println("Entre o primeiro número:");
        numi = sc.nextInt();
        System.out.println("Entre o segundo número:");
        numf = sc.nextInt();

        Atividade2_Intervalo num = new Atividade2_Intervalo(numi,numf);

        System.out.println("Soma : " + num.soma() + " - Média : " + num.media() + " - Qtde Pares : " + num.qtdePares() + " - Qtde Ímpares : " + num.qtdeImpares() + " - Numero no intervalo: " + num.qnumerosintervalos() + " - Diferença entre o primeiro e o ultimo: " + num.difereca());
        System.out.println(num.informacao());
    }
}
