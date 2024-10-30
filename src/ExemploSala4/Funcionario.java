package ExemploSala4;

public class Funcionario {

    protected String nome;
    protected String CPF;
    protected double salario;

    public Funcionario(String nome, String CPF, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double bonificacao(){
        double b = salario * 0.10;
        return b;
    }

    public String toString() {
        return "Nome: " + getNome() + "\nCpf: " + getCPF() + "\nSalario: " + getSalario();
    }
}
