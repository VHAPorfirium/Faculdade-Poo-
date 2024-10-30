package Exercicio6;

import java.util.Scanner;

public class televisaoControleRemotoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String estado = "Desligado";
        int volume = 0, canal = 0;

        Televisao televisao;

        System.out.println("Televisão desligada");

        System.out.println();

        System.out.print("Ligar/desligar: ");
        String resp1 = sc.nextLine();

        System.out.println();

        if (resp1.equalsIgnoreCase("Desligar")) {
            System.out.println("Televisão desligada.");
            sc.close();
            System.exit(0);
        }else if (resp1.equalsIgnoreCase("Ligar")) {
            estado = "Ligado";
            System.out.println("Televisão ligada.");
        }else {
            System.out.println("Opção inválida. A televisão permanecerá desligada.");
        }


        televisao = new Televisao(volume, canal, estado);

        System.out.println(televisao);

        System.out.println();

        System.out.println("Menu: ");
        System.out.println("1- Aumentar o volume ");
        System.out.println("2- Diminuir o volume ");
        System.out.println("3- trocar canal");
        System.out.println("4- Desligar tv ");
        int resp2 = sc.nextInt();

        while (resp2 != 4) {

            if (resp2 == 1) {
                System.out.print("Volume desejado: ");
                int aumentarVolume = sc.nextInt();
                televisao.setVolume(aumentarVolume);

                System.out.println();

                System.out.println(televisao);
            }
            if (resp2 == 2) {
                System.out.print("Volume desejado: ");
                int diminuirVolume = sc.nextInt();
                televisao.setVolume(diminuirVolume);

                System.out.println();

                System.out.println(televisao);
            }
            if (resp2 == 3) {
                System.out.print("Canal desejado: ");
                int trocarCanal = sc.nextInt();
                televisao.setCanal(trocarCanal);

                System.out.println();

                System.out.println(televisao);
            }

            System.out.println();

            System.out.println("Menu: ");
            System.out.println("1- Aumentar o volume ");
            System.out.println("2- Diminuir o volume ");
            System.out.println("3- trocar canal");
            System.out.println("4- Desligar tv ");
            resp2 = sc.nextInt();

        }

        System.out.println(televisao.tvDesligado());

        sc.close();
    }
}
