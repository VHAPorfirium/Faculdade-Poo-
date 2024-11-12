package Exercicio9;

public class Cadastro {
    public static void main(String[] args) {

        // Conta corrente e conta poupança
        ContaCorrente contaCorrente = new ContaCorrente(1341234, "Cleber", 220.32);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1356775, "Cleba", 2213.2);

        contaCorrente.depositar(234);
        contaCorrente.sacar(50);
        contaCorrente.transferir(100, contaPoupanca);

        System.out.println();

        contaPoupanca.depositar(260);
        contaPoupanca.sacar(60);
        contaPoupanca.transferir(80, contaCorrente);

        // Exemplo de casting:
        // Se a contaPoupanca fosse declarada como `Conta` (a classe pai),
        // Exemplo: Conta contaPoupanca = new ContaPoupanca(13567756, "Cleba", 2213.2);
        // ((ContaPoupanca) contaPoupanca).atualizarSaldo(1.5);

        contaPoupanca.atualizarSaldo(1.5);

        System.out.println();

        System.out.printf("Saldo final Conta Corrente: %.2f%n", contaCorrente.getSaldo());
        System.out.printf("Saldo final Conta Poupança: %.2f%n", contaPoupanca.getSaldo());

        System.out.println();

        // Nova Conta corrente e conta poupança
        ContaCorrente novaContaCorrente = new ContaCorrente(312312, "Novo Corrente", 300.00);
        ContaPoupanca novaContaPoupanca = new ContaPoupanca(345634, "Nova Poupança", 1200.00);

        novaContaCorrente.transferir(150, novaContaPoupanca);
        novaContaPoupanca.transferir(100, novaContaCorrente);

        System.out.println();

        System.out.printf("Saldo final Nova Conta Corrente: %.2f%n", novaContaCorrente.getSaldo());
        System.out.printf("Saldo final Nova Conta Poupança: %.2f%n", novaContaPoupanca.getSaldo());

        System.out.println();

        // Conta salario
        ContaSalario contaSalario = new ContaSalario(34562345, "Salario João", 576.97);

        contaSalario.depositar(200);
        contaSalario.sacar(50);
        contaSalario.transferir(100, novaContaCorrente);

        System.out.println();

        System.out.printf("Saldo final Conta Salário: %.2f%n", contaSalario.getSaldo());




    }
}



