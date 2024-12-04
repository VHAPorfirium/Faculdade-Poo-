package TrabalhoFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class programaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar, opcao2;

        String caminhoArquivo = "programaFinal.txt";

        // Ler e exibir o conteúdo do arquivo
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {

            String linha;
            boolean arquivoVazio = true;
            System.out.println("Conteúdo salvo no arquivo:");

            while ((linha = reader.readLine()) != null)
            {
                arquivoVazio = false;
                System.out.println(linha);
            }

            if (arquivoVazio) {
                System.out.println("Arquivo vazio.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("\nDeseja iniciar o programa?");
        String opcao1 = sc.nextLine();
        System.out.println();

        if (opcao1.equalsIgnoreCase("Sim")) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
                do {
                    // Dados da Sala de Cinema
                    System.out.println("Preencha os dados da sala de cinema: ");
                    System.out.print("Numero da sala: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome do cinema: ");
                    String nomeCinema = sc.nextLine();
                    System.out.print("Localização: ");
                    String localizacao = sc.nextLine();

                    SalaDeCinema salaDeCinema = new SalaDeCinema(numero, nomeCinema, localizacao);

                    // Dados do Filme
                    System.out.println("\nDigite os dados do filme da sala " + numero + ": ");
                    System.out.print("Nome: ");
                    String nomeFilme = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Pais de origem: ");
                    String paisOrigem = sc.nextLine();
                    System.out.print("Lingua: ");
                    String lingua = sc.nextLine();
                    System.out.print("Tipo: ");
                    String tipo = sc.nextLine();

                    Filmes filmes = new Filmes(nomeFilme, ano, paisOrigem, lingua, tipo);
                    salaDeCinema.adicionaFilmes(filmes);

                    // Dados dos Artistas
                    System.out.println("\nDigite os dados dos artistas do filme '" + nomeFilme + "': ");
                    do {
                        System.out.print("Nome: ");
                        String nomeArtista = sc.nextLine();
                        System.out.print("Idade: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nacionalidade: ");
                        String nacionalidade = sc.nextLine();

                        // Relaciona o artista no respectivo filme
                        Artista artista = new Artista(nomeArtista, idade, nacionalidade);
                        filmes.adicionarArtista(artista);

                        System.out.println();

                        System.out.println("Deseja adicionar outro artistas? (Sim/Não)");
                        opcao2 = sc.nextLine();

                        if (opcao2.equalsIgnoreCase("Sim")) {
                            System.out.println();
                        }
                    } while (opcao2.equalsIgnoreCase("Sim"));

                    // Escrever no arquivo
                    writer.write(salaDeCinema.toString().trim());
                    writer.write("\n\n");

                    System.out.println("\nRegistro salvo:");
                    System.out.println(salaDeCinema);

                    System.out.println();
                    System.out.println("Deseja adicionar outra sala de cinema?? (Sim/Não)");
                    continuar = sc.nextLine();

                } while (continuar.equalsIgnoreCase("Sim"));

            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            } finally {
                System.out.println("Programa Finalizado!");
            }
        } else if (opcao1.equalsIgnoreCase("Nao") || opcao1.equalsIgnoreCase("Não") ) {
            System.out.println("Programa Finalizado!");
        } else {
            while (!opcao1.equalsIgnoreCase("Sim") && !opcao1.equalsIgnoreCase("Nao") && !opcao1.equalsIgnoreCase("Não")) {
                System.out.print("Palavra inválida. Digite novamente: Sim ou Não: ");
                opcao1 = sc.nextLine();
            }
        }
        sc.close();
    }
}