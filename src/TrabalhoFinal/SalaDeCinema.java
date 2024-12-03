package TrabalhoFinal;

import java.util.ArrayList;
import java.util.List;

public class SalaDeCinema {

    private int numero;
    private String nome;
    private String localizacao;

    private List<Filmes> filmes = new ArrayList<Filmes>();

    public SalaDeCinema(int numero, String nome, String localizacao) {
        this.numero = numero;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public List<Filmes> getFilmes() {
        return filmes;
    }
    public void adicionaFilmes(Filmes filme) {
        filmes.add(filme);
    }

    public String listarFilmes() {
        StringBuilder lista = new StringBuilder();
        for (Filmes filme : filmes) {
            lista.append(filme).append("\n");
        }
        return lista.toString();
    }

    public String toString() {
        return "Sala: " + getNumero() + ", " + getNome() + ", " + getLocalizacao() + "\n" +
                "Filmes: " + listarFilmes();
    }
}
