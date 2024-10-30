package ExemploSala3.MusicasCompositores;

public class Compositor {
    private String nome;
    private String nacionalidade;

    public Compositor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nNacionalidade: " + getNacionalidade();
    }
}
