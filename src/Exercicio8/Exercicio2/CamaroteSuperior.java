package Exercicio8.Exercicio2;

public class CamaroteSuperior extends VIP{

    private double valorAdicionalCamarote;

    public CamaroteSuperior(Double valor, Double valorAdicional, double valorAdicionalCamarote) {
        super(valor, valorAdicional);
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public double getValorAdicionalCamarote() {
        return valorAdicionalCamarote;
    }
    public void setValorAdicionalCamarote(double valorAdicionalCamarote) {
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public double valorIngressoCamarote() {
        return ingressoVip() +  getValorAdicionalCamarote();
    }
}
