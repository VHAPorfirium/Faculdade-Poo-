package Exercicio8.Exercicio1D;

public class Horista extends Empregado{

    private double precoHora;
    private int horasTrabalhadas;

    public Horista(String nome, String sobrenome, String cpf, double precoHora, int horasTrabalhadas) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getPrecoHora() {
        return precoHora;
    }
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double vencimento(){
        return precoHora * horasTrabalhadas;
    }
}
