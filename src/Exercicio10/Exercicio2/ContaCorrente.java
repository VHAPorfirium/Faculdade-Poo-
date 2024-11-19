package Exercicio10.Exercicio2;

public class ContaCorrente extends Conta implements Tributavel {

    public double calculaTributos() {
        return saldo * 0.01;
    }

}

