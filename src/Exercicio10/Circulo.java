package Exercicio10;

public class Circulo implements CalculoArea {

    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double AreaCalculavel() {
        return Math.PI * Math.pow(raio, 2);
    }
}
