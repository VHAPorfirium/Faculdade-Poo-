package ExemploSala3.Alunos;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private String sigla;
    public ArrayList<Departamento> departamentos = new ArrayList<>();

    public Curso(String nome) {
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

    public void adicionarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    @Override
    public String toString() {
        String auxiliar = "";
        for (Departamento departamento : departamentos) {
            auxiliar = auxiliar + departamento.toString() + "\n";
        }
        return "Nome do Curso: " + getNome() + "\nSigla: " + getSigla() + "\nDepartamentos:\n" + auxiliar;
    }
}
