package Exercicio8.Exercicio1B;

public class Cargo {

    private String descricao;

    public Cargo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return descricao;
    }
}
