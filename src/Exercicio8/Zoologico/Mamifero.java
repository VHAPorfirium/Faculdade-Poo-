package Exercicio8.Zoologico;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String alimento){
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamifero(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Comprimento: " + this.getComprimento() + " cm");
        System.out.println("Numero de Patas: " + this.getNumeroPatas());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ambiente: " + this.getAmbiente());
        System.out.println("Velocidade: " + this.getVelocidadeMedia() + " m/s");
        System.out.println("Alimento: " + this.getAlimento() + "\n");

    }
}
