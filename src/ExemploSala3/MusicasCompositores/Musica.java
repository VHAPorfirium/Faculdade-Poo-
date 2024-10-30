package ExemploSala3.MusicasCompositores;

import java.util.ArrayList;

public class Musica {
    private String nome;
    private int ano;
    private String tipo;

    private ArrayList<Compositor> compositores = new ArrayList<Compositor>();

    public Musica() {

    }

    public Musica(String nome) {
        this.nome = nome;
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

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // COMPOSITOR ADICIOANADO NA LISTA.
    public void adicionarCompositor(Compositor compositor) {

        this.compositores.add(compositor);

    }

    public String toString() {
        String retorno = "";
        for (Compositor c : compositores) {
            retorno = retorno + c.toString() + "\n";
        }
        return "Nome: " + getNome() + "\nAno: " + getAno() + "\nTipo: " + getTipo() + "\nCompositores: \n" + retorno;
    }
}
