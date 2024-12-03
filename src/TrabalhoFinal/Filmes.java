package TrabalhoFinal;

import java.util.ArrayList;
import java.util.List;

public class Filmes {

    private String nome;
    private int ano;
    private String paisOrigem;
    private String lingua;
    private String tipo;

    private List<Artista> artistas = new ArrayList<Artista>();

    public Filmes() {

    }

    public Filmes(String nome, int ano, String paisOrigem, String lingua, String tipo) {
        this.nome = nome;
        this.ano = ano;
        this.paisOrigem = paisOrigem;
        this.lingua = lingua;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getPaisOrigem() {
        return paisOrigem;
    }
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    public String getLingua() {
        return lingua;
    }
    public void setLingua(String lingua) {
        this.lingua = lingua;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public List<Artista> getArtistas() {
        return artistas;
    }
    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public String listarArtistas() {
        StringBuilder lista = new StringBuilder();
        for (Artista artista : artistas) {
            lista.append(artista.toString() + ".");
            lista.append("\n");
        }
        return lista.toString();
    }

    public String toString() {
        return getNome() + ", Ano: " + getAno() + ", Pais de origem: " + getPaisOrigem() + ", Lingua: " + getLingua() + ", Tipo: " + getTipo() + "\n" +
                "Artistas: " + "\n" + listarArtistas();
    }
}
