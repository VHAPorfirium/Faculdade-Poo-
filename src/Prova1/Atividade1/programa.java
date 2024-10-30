package Prova1.Atividade1;

public class programa {
    public static void main(String[] args) {

        Endereco enderecoFornecedor = new Endereco("Rua dos Desenvolvedores", 122);
        Fornecedor fornecedor = new Fornecedor("Carrefur", enderecoFornecedor);

        Software software = new Software("linux", 500.0, 1980, "v.321321");
        Hardware hardware = new Hardware("Placa mãe", 200000.0, 2024,51456156);

        fornecedor.adicionarProduto(software);
        fornecedor.adicionarProduto(hardware);

        System.out.println("Fornecedor: " + fornecedor.getNome());
        System.out.println("Endereço: " + enderecoFornecedor);

        System.out.println();

        System.out.println("Produtos: ");
        for (Produto produto : fornecedor.getProdutos()) {
            System.out.println(produto.getDetalhes());
        }
    }
}
