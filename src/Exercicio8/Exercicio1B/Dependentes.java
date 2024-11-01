package Exercicio8.Exercicio1B;

public class Dependentes {

    private String nome;
    private char sexo;
    private Funcionario funcionario;

    public Dependentes(String nome, char sexo, Funcionario funcionario) {
        this.nome = nome;
        this.sexo = sexo;
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String toString() {
        return nome + " - " + sexo;
    }
}
