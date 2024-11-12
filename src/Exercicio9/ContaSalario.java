package Exercicio9;

public class ContaSalario extends ContaCorrente {

    public ContaSalario(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        double valorFinal = valor - 0.01;
        setSaldo(getSaldo() + valorFinal);
        System.out.printf("Depósito realizado em ContaSalario R$ " + valor + ". Novo saldo: %.2f%n", getSaldo());
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor + 0.01) {
            setSaldo(getSaldo() - valor - 0.01);
            System.out.printf("Saque realizado em ContaSalario: R$  " + valor + ". Novo saldo: %.2f%n", getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque em ContaSalario.");
        }
    }
}


