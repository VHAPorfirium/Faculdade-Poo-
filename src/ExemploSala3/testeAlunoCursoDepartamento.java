package ExemploSala3;

import ExemploSala3.Alunos.Alunos;
import ExemploSala3.Alunos.Curso;
import ExemploSala3.Alunos.Departamento;

public class testeAlunoCursoDepartamento {
    public static void main(String[] args) {

        Alunos alunos1 = new Alunos("juao");
        alunos1.setMatricula(2526);
        alunos1.setAno(2024);

        Alunos alunos2 = new Alunos("cleba");
        alunos2.setMatricula(2527);
        alunos2.setAno(2024);

        Alunos alunos3 = new Alunos("Maria Julia");
        alunos3.setMatricula(2528);
        alunos3.setAno(2024);

        Curso curso1 = new Curso("Analise e desenvolvimento de sistema.");
        curso1.setSigla("Ads");

        Curso curso2 = new Curso("Bio-Medicina.");
        curso2.setSigla("BioMed");

        Curso curso3 = new Curso("Medicina.");
        curso3.setSigla("Med");

        Departamento departamento1 = new Departamento("Coordenação de ADS");
        departamento1.setSigla("ADS-COORD");

        Departamento departamento2 = new Departamento("Coordenação de Biomedicina");
        departamento2.setSigla("BIO-COORD");

        Departamento departamento3 = new Departamento("Coordenação de Medicina");
        departamento3.setSigla("MED-COORD");

        curso1.adicionarDepartamento(departamento1);
        curso2.adicionarDepartamento(departamento2);
        curso3.adicionarDepartamento(departamento3);

        alunos1.adicionarCurso(curso1);
        alunos2.adicionarCurso(curso2);
        alunos3.adicionarCurso(curso3);

        System.out.println(alunos1);
        System.out.println(alunos2);
        System.out.println(alunos3);
    }
}
