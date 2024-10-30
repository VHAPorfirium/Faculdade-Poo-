package Exercicio6;

public class clienteCadastroMultiploTeste {
    public static void main(String[] args) {

        Cliente[] clientes = new Cliente[5];

        clientes[0] = new Cliente("Maria");
        clientes[0].setTelefone("629823-2000");
        clientes[0].setIdade(20);

        clientes[1] = new Cliente("Joao");
        clientes[1].setTelefone("629823-2001");
        clientes[1].setIdade(21);

        clientes[2] = new Cliente("Pedro");
        clientes[2].setTelefone("629823-2002");
        clientes[2].setIdade(22);

        clientes[3] = new Cliente("kleba");
        clientes[3].setTelefone("629823-2003");
        clientes[3].setIdade(23);

        clientes[4] = new Cliente("Pedro");
        clientes[4].setTelefone("629823-2004");
        clientes[4].setIdade(24);

        for (Cliente cliente : clientes) {

            System.out.println("--------------cliente---------------------");
            System.out.println(cliente.toString());

            System.out.println();

        }


    }
}
