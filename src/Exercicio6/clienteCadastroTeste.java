package Exercicio6;

public class clienteCadastroTeste {
    public static void main(String[] args) {

        Cliente clientes = new Cliente("Maria");
        clientes.setTelefone("629823-2323");
        clientes.setIdade(20);

        System.out.println("Cliente : " + clientes.getNome() + " - Idade : " + clientes.getIdade() + " - Telefone : " + clientes.getTelefone());

        System.out.println("----------------------------------------------------------------");

        System.out.println(clientes);


    }
}
