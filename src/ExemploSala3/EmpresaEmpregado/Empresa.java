package ExemploSala3.EmpresaEmpregado;

import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    String razaoSocial;
    private Endereco endereco;
    private ArrayList<Empregado> empregados;

    public Empresa(String cnpj, String razaoSocial, Endereco endereco) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    @Override
    public String toString() {
        String empregadosInfo = "";
        for (Empregado empregado : empregados) {
            empregadosInfo += empregado.toString() + "\n";
        }
        return "Empresa: " + razaoSocial + "\nCNPJ: " + cnpj + "\nEndereço: " + endereco.toString() + "\nEmpregados:\n" + empregadosInfo;
    }
}
