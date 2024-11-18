package Exercicio10;

public class Teste {
    public static void main(String[] args) {
        CalculoArea[] objetos = new CalculoArea[5];

        objetos[0] = new Quadrado(4);
        objetos[1] = new Retangulo(5, 3);
        objetos[2] = new Circulo(2);
        objetos[3] = new Quadrado(6);
        objetos[4] = new Retangulo(7, 2);

        for (CalculoArea obj : objetos) {
            System.out.println("Área: " + obj.AreaCalculavel());
        }
    }
}

