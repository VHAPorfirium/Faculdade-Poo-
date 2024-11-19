package Exercicio10.Exercicio2;

public class TestaTributavel {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(1000);

        SeguroDeVida seguro = new SeguroDeVida();

        Tributavel[] tributaveis = new Tributavel[2];
        tributaveis[0] = cc;
        tributaveis[1] = seguro;

        for (Tributavel t : tributaveis) {
            System.out.println("Tributo calculado: " + t.calculaTributos());
        }

        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
    }
}


