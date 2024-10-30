package ExemploSala4;

public class testeFuncioanario {
    public static void main(String[] args) {


        Gerente g = new Gerente("Victor", "202515156", 3000, 1234);

        Funcionario f = new Funcionario("Cleba", "02151581", 2000);

        System.out.println(f);
        System.out.println("A bonificação do funcionario é de " + f.bonificacao() + " Reais.");

        System.out.println("----------------------------------------------------------------------------");

        System.out.println(g);
        System.out.println("A bonificação do funcionario é de " + g.bonificacao() + " Reais.");
    }
}