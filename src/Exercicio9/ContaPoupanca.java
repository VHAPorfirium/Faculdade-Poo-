package Exercicio9;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public void atualizarSaldo(double taxaRendimento) {
        double novoSaldo = getSaldo() * (1 + taxaRendimento / 100);
        setSaldo(novoSaldo);
        System.out.printf("Saldo atualizado com rendimento. Novo saldo: %.2f%n", getSaldo());
    }
}


