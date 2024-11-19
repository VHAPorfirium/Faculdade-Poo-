package Exercicio10.Exercicio1;

public class Quadrado implements CalculoArea{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double AreaCalculavel() {
        return getLado() * getLado();
    }
}
