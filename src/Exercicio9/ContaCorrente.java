package Exercicio9;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        double valorFinal = valor - 0.05;
        setSaldo(getSaldo() + valorFinal);
        System.out.printf("Depósito realizado em ContaCorrente R$ " + valor + ". Novo saldo: %.2f%n", getSaldo());
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor + 0.05) {
            setSaldo(getSaldo() - valor - 0.05);
            System.out.printf("Saque realizado em ContaCorrente: R$ " + valor + ". Novo saldo: %.2f%n", getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque em ContaCorrente.");
        }
    }
}

