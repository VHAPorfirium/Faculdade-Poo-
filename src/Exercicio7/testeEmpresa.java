package Exercicio7;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class testeEmpresa {
    public static void main(String[] args) {
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        String resposta = JOptionPane.showInputDialog(null, "Cadastrar nova empresa (S/N)?");

        while (resposta.equalsIgnoreCase("S")) {

            if (resposta.equalsIgnoreCase("S")) {
                String nome = JOptionPane.showInputDialog(null, "Digite o nome da empresa:");
                String cnpj = JOptionPane.showInputDialog(null, "Digite o CNPJ da empresa:");

                String nomeResponsavel = JOptionPane.showInputDialog(null, "Digite o nome do responsável:");
                int telefone = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o telefone do responsavel:"));

                Empresa empresa = new Empresa(nome, cnpj, new Responsavel(nomeResponsavel, telefone));
                listaEmpresas.add(empresa);

                JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!");
                JOptionPane.showMessageDialog(null, empresa);

                String resposta2 = JOptionPane.showInputDialog(null, "Dejesa cadastrar produtos para essa empresa (S/N)? ");

                while (resposta2.equalsIgnoreCase("S")) {

                    String nomeProduto = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
                    int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho: "));
                    String tipo = JOptionPane.showInputDialog(null, "Digite o tipo do produto:");
                    String cor = JOptionPane.showInputDialog(null, "Digite a cor:");
                    String especificacao = JOptionPane.showInputDialog(null, "Digite o especificação do produto:");

                    Produto produto = new Produto(nomeProduto, tamanho, tipo, cor, especificacao);
                    empresa.adicionarProduto(produto);

                    JOptionPane.showMessageDialog(null, produto);

                    resposta2 = JOptionPane.showInputDialog(null, "Dejesa cadastrar outro produto? ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro encerrado.");
                break;
            }

            resposta = JOptionPane.showInputDialog(null, "Cadastrar nova empresa (S/N)?");

        }

        if (!listaEmpresas.isEmpty()) {
            StringBuilder todasEmpresas = new StringBuilder("Empresas cadastradas:\n\n");
            for (Empresa empresa : listaEmpresas) {
                todasEmpresas.append(empresa.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, todasEmpresas.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma empresa foi cadastrada.");
        }


    }
}

