package Exercicio11;

public class Calculadora {

    private int a;
    private int b;

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int soma() {
        return a + b;
    }

    public int subtracao() {
        return a - b;
    }

    public int multiplicacao() {
        return a * b;
    }

    public int divisao() {
       try{
           return a /b;
       }
       catch(ArithmeticException e){
           System.out.print("Não pode haver divisão por "); return 0;
       }
    }
}
