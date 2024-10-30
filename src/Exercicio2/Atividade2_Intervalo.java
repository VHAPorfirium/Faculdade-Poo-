package Exercicio2;

public class Atividade2_Intervalo {

    int numi;
    int numf;

    public Atividade2_Intervalo(int numi, int numf) {
        this.numi = numi;
        this.numf = numf;
    }

    public void Intervalo (int numi, int numf) {
        if (numi < numf) {
            this.numi = numi;
            this.numf = numf;
        }
        else{
            this.numi = numf;
            this.numf = numi;
        }
    }

    public double soma() {
        double soma = 0;
        for (int i = numi; i < numf + 1; i++) {
            soma = soma + i;
        }
        return soma;
    }

    public double media() {

        return soma() / (numf-numi+1);

    }

    public int qtdePares() {

        int qtde = 0;
        for (int i = numi; i < numf + 1; i++) {
            if ((i % 2) == 0)
                qtde++;
        }
        return qtde;

    }
    public int qtdeImpares() {

        int qtde = 0;
        for (int i = numi; i < numf + 1; i++) {
            if ((i % 2) > 0)
                qtde++;
        }
        return qtde;

    }

    public int qnumerosintervalos() {
        int intervalo = 0;

        for (int i = numi; i < numf; i++) {
            intervalo += 1;

        }

        return intervalo;
    }

    public int difereca() {

        return numf - numi;

    }

    public String informacao() {

        return  "Intervalo entre " + numi + " e " + numf;

    }
}
