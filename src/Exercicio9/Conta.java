package Exercicio9;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Depósito realizado R$ " + valor + ". Novo saldo: %.2f%n", saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque realizado. Novo saldo: %.2f%n", saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            sacar(valor);
            System.out.printf("Transferência realizada de %.2f. Novo saldo: %.2f%n", valor, saldo);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}

