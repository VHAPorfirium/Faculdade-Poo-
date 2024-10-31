package Exercicio8.Exercicio1B;

import java.util.ArrayList;
import java.util.List;

public class teste {

    public static void main(String[] args) {
        Cargo cargo = new Cargo("Gerente de Projetos");

        Dependentes dependente1 = new Dependentes("Maria", 'F');
        Dependentes dependente2 = new Dependentes("João", 'M');

        List<Dependentes> listaDependentes = new ArrayList<>();
        listaDependentes.add(dependente1);
        listaDependentes.add(dependente2);

        Funcionario funcionario1 = new Funcionario("Carlos ", "68156489", cargo, listaDependentes);

        System.out.println(funcionario1);
    }
}
