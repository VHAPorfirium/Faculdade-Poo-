package Prova1.Atividade1;

public class Hardware extends Produto {

    private int registro;

    public Hardware(String descricao, double preco, int ano, int registro) {
        super(descricao, preco, ano);
        this.registro = registro;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

     @Override
    public String getDetalhes() {
        return "Hardware: " + getDescricao() + ", Registro: " + registro;
    }
}
