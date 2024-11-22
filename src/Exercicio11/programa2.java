package Exercicio11;

public class programa2 {
    public static void main(String[] args) {

        Calculadora calculo1 = new Calculadora(10, 2);

        System.out.println("Resultado calculo 1: ");
        System.out.println(calculo1.soma());
        System.out.println(calculo1.subtracao());
        System.out.println(calculo1.multiplicacao());
        System.out.println(calculo1.divisao());

        System.out.println();

        Calculadora calculo2 = new Calculadora(10, 5);

        System.out.println("Resultado calculo 2: ");
        System.out.println(calculo2.soma());
        System.out.println(calculo2.subtracao());
        System.out.println(calculo2.multiplicacao());
        System.out.println(calculo2.divisao());

        System.out.println();

        Calculadora calculo3 = new Calculadora(10, 0);

        System.out.println("Resultado calculo 3: ");
        System.out.println(calculo3.soma());
        System.out.println(calculo3.subtracao());
        System.out.println(calculo3.multiplicacao());
        System.out.println(calculo3.divisao());

    }
}
