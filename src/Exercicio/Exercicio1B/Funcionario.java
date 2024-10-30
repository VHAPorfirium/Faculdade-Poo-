package Exercicio.Exercicio1B;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String nome;
    private String cpf;
    private Cargo cargo;
    private List<Dependentes> dependentes;

    public Funcionario(String nome, String cpf, Cargo cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dependentes = new ArrayList<>();
    }

    public Funcionario(String nome, String cpf, Cargo cargo, List<Dependentes> dependentes) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dependentes = dependentes != null ? dependentes : new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Dependentes> getDependentes() {
        return dependentes;
    }

    public void addDependente(Dependentes dependente) {
        dependentes.add(dependente);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Dependentes dependente : dependentes) {
            s.append(dependente).append("\n");
        }

        return "Nome: " + nome +
                " - CPF: " + cpf +
                " - Cargo: " + cargo +
                " - Dependentes:\n" + s;
    }
}
