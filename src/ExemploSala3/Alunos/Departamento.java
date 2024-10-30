package ExemploSala3.Alunos;

public class Departamento {

    private String nome;
    private String sigla;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nSigla: " + getSigla();
    }
}
