package ExemploSala3.EmpresaEmpregado;

public class Empregado {
    private String nome;
    private int matricula;
    private Empresa empresa;

    public Empregado(String nome, int matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nMatrícula: " + matricula + "\nEmpresa: " + empresa.razaoSocial;
    }
}
