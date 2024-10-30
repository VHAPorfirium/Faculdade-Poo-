package Exercicio6;

import java.util.Scanner;

public class roboTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Robo robo1 = new Robo();
        Robo robo2 = new Robo();

        int limitePo;

        System.out.println("Crie 2 robôs: ");
        System.out.println("Identificador robo 1: ");
        int identificador1 = sc.nextInt();
        robo1.setIdentificador(identificador1);

        System.out.println("Limite de pó: ");
        limitePo = sc.nextInt();
        robo1.setLimitePo(limitePo);

        System.out.println();

        System.out.println("Identificador robo 2: ");
        int identificador2 = sc.nextInt();
        robo2.setIdentificador(identificador2);

        System.out.println("Limite de pó: ");
        limitePo = sc.nextInt();
        robo2.setLimitePo(limitePo);

        System.out.println("Menu: ");
        System.out.println("Escolha o robô: ");
        System.out.println("1- Robo: " + identificador1);
        System.out.println("2- Robo: " + identificador2);
        System.out.println("3- Sair.");
        int escolha1 = sc.nextInt();
        sc.nextLine();

        if (escolha1 == 1) {

            System.out.println("Ligar / Desligar: Robo " + identificador1);
            String escolha = sc.nextLine();

            if (escolha.equalsIgnoreCase("Ligar")) {
                robo1.ligar();
            } else {
                System.out.println("Robô " + identificador1 + " desligado.");
                return;
            }

            int escolha2 = 0;

            while (escolha2 != 3) {
                System.out.println("Operações disponíveis: ");
                System.out.println("1- Andar: ");
                System.out.println("2- Aspirar: ");
                System.out.println("3- Desligar: ");
                escolha2 = sc.nextInt();

                if (escolha2 == 1) {
                    System.out.println("Digite a coordenada X: ");
                    int x = sc.nextInt();
                    System.out.println("Digite a coordenada Y: ");
                    int y = sc.nextInt();
                    robo1.andar(x, y);
                    System.out.println("Nova posição: (" + robo1.getPosicaoX() + ", " + robo1.getPosicaoY() + ")");

                    System.out.println();
                    System.out.println("--------------------------------");
                    System.out.println("Dados do robo 1: ");
                    System.out.println(robo1);
                    System.out.println();
                    System.out.println("--------------------------------");
                }

                if (escolha2 == 2) {
                    System.out.println("Quantidade aspirada: ");
                    int quantidadePo = sc.nextInt();
                    robo1.aspirar(quantidadePo);

                    System.out.println();
                    System.out.println("--------------------------------");
                    System.out.println("Dados do robo 1: ");
                    System.out.println(robo1);
                    System.out.println();
                    System.out.println("--------------------------------");

                }

                if (escolha2 == 3) {
                    robo1.desligar();
                    System.out.println("Robô " + identificador1 + " desligado.");
                    break;
                }
            }
        } else if (escolha1 == 2) {
            System.out.println("Ligar / Desligar: Robo " + identificador2);
            String escolha4 = sc.nextLine();

            if (escolha4.equalsIgnoreCase("Ligar")) {
                robo2.ligar();
            } else {
                System.out.println("Robô " + identificador2 + " desligado.");
                return;
            }

            int escolha5 = 0;

            while (escolha5 != 3) {
                System.out.println("Operações disponíveis: ");
                System.out.println("1- Andar: ");
                System.out.println("2- Aspirar: ");
                System.out.println("3- Desligar: ");
                escolha5 = sc.nextInt();

                if (escolha5 == 1) {
                    System.out.println("Digite a coordenada X: ");
                    int x = sc.nextInt();
                    System.out.println("Digite a coordenada Y: ");
                    int y = sc.nextInt();
                    robo2.andar(x, y);
                    System.out.println("Nova posição: (" + robo2.getPosicaoX() + ", " + robo2.getPosicaoY() + ")");

                    System.out.println();
                    System.out.println("--------------------------------");
                    System.out.println("Dados do robo 2: ");
                    System.out.println(robo2);
                    System.out.println();
                    System.out.println("--------------------------------");

                }

                if (escolha5 == 2) {
                    System.out.println("Quantidade aspirada: ");
                    int quantidadePo = sc.nextInt();
                    robo2.aspirar(quantidadePo);

                    System.out.println();
                    System.out.println("--------------------------------");
                    System.out.println("Dados do robo 2: ");
                    System.out.println(robo2);
                    System.out.println();
                    System.out.println("--------------------------------");

                }

                if (escolha5 == 3) {
                    robo2.desligar();
                    System.out.println("Robô " + identificador2 + " desligado.");
                    break;
                }
            }
        }

        sc.close();
    }
}