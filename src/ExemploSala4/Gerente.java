package ExemploSala4;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente(String nome, String CPF, double salario) {
        super(nome, CPF, salario);

    }

    public Gerente(String nome, String CPF, double salario, int senha) {
        super(nome, CPF, salario);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double bonificacao(){
        double b = salario * 0.15;
        return b;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nCpf: " + getCPF() + "\nSalario: " + getSalario();
    }
}
