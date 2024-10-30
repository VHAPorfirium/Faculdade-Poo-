package ExemploSala2;

public class Exemplo2_Curso {

    private String nome;
    private int codigo;

    Exemplo2_Curso (String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String toString() {
        return "Nome do aluno: " + getNome() + "\nCodigo do aluno: " + getCodigo();
    }

}
