package Exercicio10.Exercicio2;

public abstract class Conta {

    protected double saldo;

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

