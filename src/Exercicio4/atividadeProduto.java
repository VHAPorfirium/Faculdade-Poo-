package Exercicio4;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class atividadeProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Produto> produtos = new HashMap<>();

        int codigo = 0;
        String nomeProduto = "null";
        int quantidade = 0;
        String tipo = "";
        double valor = 0.0;
        int qtdCompra = 0;
        Produto produto = null;

        System.out.println("Deseja iniciar o cadastramento dos produtos? ");
        String inicio = sc.nextLine();

        if (inicio.equalsIgnoreCase("sim")) {

            do {
                System.out.print("Código (obrigatório): ");
                codigo = sc.nextInt();
                sc.nextLine();

                System.out.println("Deseja cadastar o nome do produto? ");
                String resposta1 = sc.nextLine();

                if (resposta1.equalsIgnoreCase("Sim")) {
                    System.out.print("Nome: ");
                    nomeProduto = sc.nextLine();
                }

                System.out.println("Deseja cadastrar a quantidade? ");
                String resposta2 = sc.nextLine();

                if (resposta2.equalsIgnoreCase("Sim")) {
                    System.out.print("Quantidade: ");
                    quantidade = sc.nextInt();
                    sc.nextLine();
                }

                System.out.println("Deseja cadastrar o tipo do produto? ");
                String resposta3 = sc.nextLine();

                if (resposta3.equalsIgnoreCase("Sim")) {
                    System.out.print("Tipo: ");
                    tipo = sc.nextLine();
                }

                System.out.println("Deseja cadastrar o valor do produto? ");
                String resposta4 = sc.nextLine();

                if (resposta4.equalsIgnoreCase("Sim")) {
                    System.out.print("Valor: ");
                    valor = sc.nextDouble();
                }


                if (nomeProduto != null && quantidade > 0 && tipo != null && valor > 0) {

                    produto = new Produto(codigo, nomeProduto, quantidade, tipo, valor);
                    produtos.put(codigo, produto);

                } else if (nomeProduto != null && quantidade > 0 && tipo != null) {

                    produto = new Produto(codigo, nomeProduto, quantidade, tipo);
                    produtos.put(codigo, produto);

                } else if (nomeProduto != null && quantidade > 0) {

                    produto = new Produto(codigo, nomeProduto, quantidade);
                    produtos.put(codigo, produto);

                } else if (nomeProduto != null) {

                    produto = new Produto(codigo, nomeProduto);
                    produtos.put(codigo, produto);

                } else {

                    produto = new Produto(codigo);
                    produtos.put(codigo, produto);

                }

                System.out.println();
                System.out.println("Cadastrado com sucesso!");
                System.out.println(produto);

                System.out.println();
                sc.nextLine();

                System.out.println("Deseja cadastrar outro produto? ");
                inicio = sc.nextLine();

            } while (inicio.equalsIgnoreCase("sim"));

            int escolha;

            do {

                System.out.println();

                System.out.println("Menu");
                System.out.println("1. Vender");
                System.out.println("2. Comprar (com alteração de valor)");
                System.out.println("3. Comprar (sem alteração de valor)");
                System.out.println("4. Consultar produto");
                System.out.println("5. Inserir/alterar dados do produto");
                System.out.println("6. Verificar se produtos são iguais");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.print("Digite o código do produto para vender: ");
                        int codigoVenda = sc.nextInt();
                        Produto produtoVenda = produtos.get(codigoVenda);

                        if (produtoVenda != null) {
                            System.out.print("Digite a quantidade para vender: ");
                            int qtdVenda = sc.nextInt();
                            produtoVenda.vender(qtdVenda);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                        break;

                    case 2:
                        System.out.print("Digite o código do produto para comprar: ");
                        int codigoCompra = sc.nextInt();
                        Produto produtoCompra = produtos.get(codigoCompra);

                        if (produtoCompra != null) {
                            System.out.print("Digite a quantidade para comprar: ");
                            qtdCompra = sc.nextInt();
                            System.out.print("Digite o novo valor do produto: ");
                            double novoValor = sc.nextDouble();
                            produtoCompra.comprar(qtdCompra, novoValor);
                        } else {

                            System.out.println("Produto não encontrado.");

                        }

                        break;

                    case 3:
                        System.out.print("Digite o código do produto para comprar: ");
                        codigoCompra = sc.nextInt();
                        produtoCompra = produtos.get(codigoCompra);

                        if (produtoCompra != null) {
                            System.out.print("Digite a quantidade para comprar: ");
                            qtdCompra = sc.nextInt();
                            produtoCompra.comprar(qtdCompra);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                        break;


                    case 4:
                        System.out.print("Digite o código do produto para consultar: ");
                        int codigoConsulta = sc.nextInt();
                        Produto produtoConsulta = produtos.get(codigoConsulta);

                        if (produtoConsulta != null) {
                            System.out.println(produtoConsulta);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                        break;

                    case 5:
                        System.out.print("Digite o código do produto para alterar: ");
                        int codigoAlterar = sc.nextInt();
                        Produto produtoAlterar = produtos.get(codigoAlterar);

                        if (produtoAlterar != null) {
                            sc.nextLine();
                            System.out.print("Digite o novo nome do produto: ");
                            String nome = sc.nextLine();
                            System.out.print("Digite a nova quantidade: ");
                            int novaQtd = sc.nextInt();

                            sc.nextLine();
                            System.out.print("Digite o tipo: ");
                            String novoTipo = sc.nextLine();
                            System.out.print("Digite o valor: ");
                            double novoValorProd = sc.nextDouble();
                            produtoAlterar.inserir(nome, novaQtd, novoTipo, novoValorProd);
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                        break;

                    case 6:
                        sc.nextLine();

                        System.out.print("Digite o nome do produto para comparar: ");
                        String nomeComparacao = sc.nextLine();

                        System.out.print("Digite o tipo do produto para comparar: ");
                        String tipoComparacao = sc.nextLine();

                        Produto outroProduto = new Produto(0, nomeComparacao, 0, tipoComparacao, 0.0);

                        if (produto.igual(outroProduto)) {
                            System.out.println("Os produtos são iguais.");
                        } else {
                            System.out.println("Os produtos são diferentes.");
                        }
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } while (escolha != 0);

        }else {

            System.out.println("Progama nao inicializado.");

        }



        sc.close();
    }
}