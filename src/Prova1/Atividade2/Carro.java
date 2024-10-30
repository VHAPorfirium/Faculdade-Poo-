package Prova1.Atividade2;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String Modelo) {
        this.marca = marca;
        this.modelo = Modelo;
    }
    public Carro(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}
