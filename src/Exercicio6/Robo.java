package Exercicio6;

public class Robo {

    private int identificador;
    private String status;
    private int posicaoX;
    private int posicaoY;
    private int quantidadePo;
    private int limitePo;

    public Robo() {
        this.status = "Desligado";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.quantidadePo = 0;
    }

    public Robo(int identificador, String status, int posicaoX, int posicaoY, int quantidadePo, int limitePo) {
        this.identificador = identificador;
        this.status = "Desligado";
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.quantidadePo = quantidadePo;
        this.limitePo = limitePo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getQuantidadePo() {
        return quantidadePo;
    }

    public void setQuantidadePo(int quantidadePo) {
        this.quantidadePo = quantidadePo;
    }

    public int getLimitePo() {
        return limitePo;
    }

    public void setLimitePo(int limitePo) {
        this.limitePo = limitePo;
    }


    public void ligar() {
        this.setStatus("Ligado");
        System.out.println("O robô foi ligado.");
    }

        
    public void desligar() {
        this.setStatus("Desligado");
        System.out.println("O robô foi desligado.");
    }

    public void andar(int X, int Y) {
        this.posicaoX += X;
        this.posicaoY += Y;
        this.setStatus("Andando");
        System.out.println("O robô está andando para a posição (" + this.posicaoX + ", " + this.posicaoY + ").");
    }

    public void aspirar(int quantidadeAspirado) {
        if (quantidadeAspirado > this.limitePo) {
            System.out.println("Valor inválido. O limite de pó foi excedido.");
        }
        else {
            this.quantidadePo += quantidadeAspirado;
            System.out.println("O robô aspirou " + quantidadeAspirado + " unidades de pó.");
        }
    }


    public void parar(){
        this.status = "Parado";
    }

    public String toString(){
        return "Identificador: " + this.identificador + "\nStatus: " + this.status + "\nPosição X: " + this.posicaoX + "\nPosição Y: " + this.posicaoY + "\nQuantidade de pó: " + this.quantidadePo + "\nLimite de pó: " + this.limitePo;
    }

}

