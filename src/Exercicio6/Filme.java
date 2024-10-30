package Exercicio6;

import java.util.ArrayList;

public class Filme {

    private String codigo;
    private String nome;
    private String genero;
    private int ano;
    private String autorPrincipal;

    ArrayList<String> listaCodigos = new ArrayList<String>();
    ArrayList<String> listaNomes = new ArrayList<String>();

    public Filme(){

    }

    public Filme(String codigo, String nome ) {
        this.codigo = codigo;
        this.nome = nome;
    }

    private static int totalFilmes = 0;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public void adicionarFilme(String codigo, String nome) {
        listaCodigos.add(codigo);
        listaNomes.add(nome);
        totalFilmes++;
    }

    public static int getTotalFilmes() {
        return totalFilmes;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Filmes:\n");

         for (int i = 0; i < listaCodigos.size(); i++) {
            sb.append("Código: ").append(listaCodigos.get(i))
                    .append("\nNome: ").append(listaNomes.get(i)).append("\n");
        }

        return sb.toString();
    }
}
