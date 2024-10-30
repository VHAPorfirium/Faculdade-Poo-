package ExemploSala3;

import ExemploSala3.ClienteEndereco.Cliente;
import ExemploSala3.ClienteEndereco.EnderecoCliente;

public class testeClienteEndereco {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("roberto");
        cliente1.setCpf("78962326963");
        EnderecoCliente endereco1 = new EnderecoCliente("em", 733, "Vila maua", "Quadra 63 lote 3", "Goiania", "GO");

        Cliente cliente2 = new Cliente("cleba");
        cliente2.setCpf("7451915648943");
        EnderecoCliente endereco2 = new EnderecoCliente("9", 10, "Vila peixoto", "Quadra 28 lote 23", "Goiania", "GO");

        cliente1.adicionarEndereco(endereco1);
        cliente2.adicionarEndereco(endereco2);

        System.out.println(cliente1);
        System.out.println();
        System.out.println(cliente2);


    }
}
