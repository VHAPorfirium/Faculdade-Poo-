package Exercicio.Zoologico;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristicas) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void dadosPeixe() {
        System.out.println("Nome: " + getNome());
        System.out.println("Comprimento: " + getComprimento() + " cm");
        System.out.println("Numero de Patas: " + getNumeroPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade: " + getVelocidadeMedia() + " m/s");
        System.out.println("Caracteristicas: " + getCaracteristicas() + "\n");
    }


}
