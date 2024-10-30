package Exercicio.Exercicio2;

public class VIP extends Ingresso{

    private Double valorAdicional;

    public VIP(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double ingressoVip() {
        return imprimirValor() + getValorAdicional();
    }
}
