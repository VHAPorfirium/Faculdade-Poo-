package Exercicio3;

import java.util.Scanner;

public class atividadeCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informações do carro: ");
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.print("Cor: ");
        String cor = sc.nextLine();

        System.out.print("Capacidade do motor: ");
        float capacidade = sc.nextFloat();

        System.out.print("Velocidade Maxima: ");
        int velocidadeMaxima = sc.nextInt();

        Carro carro = new Carro(modelo, marca, ano, capacidade, velocidadeMaxima);

        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Capacidade do motor: " + capacidade + " Cc");
        System.out.println("Velocidade Maxima: " + velocidadeMaxima + " km/h");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();

        sc.nextLine();

        System.out.println("Deseja ligar o carro? sim ou nao");
        String resposta1 = sc.nextLine();

        if (resposta1.equalsIgnoreCase("sim")) {
            System.out.println(Carro.ligar());

            System.out.println("Velocidade inicial = 0 km/h ");

            System.out.println("Deseja acelerar o carro? sim ou nao");
            String resposta2 = sc.nextLine();

            if (resposta2.equalsIgnoreCase("sim")) {
                System.out.print("Velocidade a aumentar: ");
                int velocidade2 = sc.nextInt();

                while (velocidade2 > velocidadeMaxima ) {

                    System.out.println("Velocidade incompativel com o carro. Digite novamente: ");
                    velocidade2 = sc.nextInt();
                    carro.aumentarVelocidade(velocidade2);

                }

                sc.nextLine();

                System.out.println("Velocidade atual do carro: " + carro.aumentarVelocidade(velocidade2) + " km/h");

                System.out.println("Deseja frear o carro? sim ou nao");
                if (sc.nextLine().equalsIgnoreCase("sim")) {
                    System.out.print("Velocidade a reduzir: ");
                    int velocidade3 = sc.nextInt();
                    carro.diminuirVelocidade(velocidade3);

                    System.out.println("Velocidade atual do carro: " + carro.diminuirVelocidade(velocidade3) + " km/h");
                    System.out.println("Carro atingiu limite de quilometragem");

                    System.out.println();

                    System.out.println("Carro com velocidade reduzida a 0 km/h");

                    System.out.println();

                    System.out.println(Carro.parar());

                    System.out.println();

                    System.out.println(Carro.desligar());

                } else {
                    System.out.println("Velocidade " + carro.aumentarVelocidade(velocidade2) + " km/h");

                    System.out.println("Carro com velocidade reduzida a 0 km/h");

                    System.out.println();

                    System.out.println(Carro.parar());

                    System.out.println();

                    System.out.println(Carro.desligar());

                }
            } else {
                System.out.println(Carro.parar());

                System.out.println(Carro.desligar());
            }

        } else if (resposta1.equalsIgnoreCase("nao")) {
            System.out.println(Carro.parar());

            System.out.println(Carro.desligar());
        }


        sc.close();
    }
}

