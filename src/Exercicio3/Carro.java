package Exercicio3;

public class Carro {

    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public float capacidadeMotor;
    public int velocidadeMaxima;
    public int velocidadeAtual;

    public Carro(String modelo, String marca, int ano, float capacidade, int velocidadeMaxima) {
        this.modelo = this.modelo;
        this.marca = this.marca;
        this.ano = this.ano;
        this.cor = cor;
        this.capacidadeMotor = capacidadeMotor;
        this.velocidadeMaxima = this.velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public static String ligar() {
        return "Carro ligado! ";
    }
    public static String desligar() {
        return "Carro desligado! ";
    }
    public static String parar() {
        return "Carro parado! Velocidade = 0 km/h ";
    }

    public int aumentarVelocidade(int velocidade2) {
        this.velocidadeAtual = this.velocidadeAtual + velocidade2;

        return this.velocidadeAtual;

    }

    public int diminuirVelocidade(int velocidade3) {
        int novaVelocidade3 = this.velocidadeAtual - velocidade3;

        if (novaVelocidade3 < 0) {

            System.out.println("A velocidade não pode ser negativa.");

        }
        else {

            return novaVelocidade3;

        }


        return 0;
    }


}
