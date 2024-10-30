package ExemploSala3;

import ExemploSala3.EmpresaEmpregado.Empregado;
import ExemploSala3.EmpresaEmpregado.Empresa;
import ExemploSala3.EmpresaEmpregado.Endereco;

public class testeEmpresaEmpregadoEndereco {
    public static void main(String[] args) {



        Endereco enderecoEmpresa = new Endereco("em 54", 0, "Sem complemento", "12345-678", "Vila Brasil", "Goiânia", "GO");

        Empresa empresa = new Empresa("1200000000000000000", "Puc-GO", enderecoEmpresa);

        Empregado empregado1 = new Empregado("Victor", 1234, empresa);
        Empregado empregado2 = new Empregado("Maria", 5678, empresa);

        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);

        System.out.println(empresa);
    }
}
