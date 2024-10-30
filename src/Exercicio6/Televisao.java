package Exercicio6;

public class Televisao {
    private int volume;
    private int canal;
    private String estado;

    public Televisao() {
        this.volume = 0;
        this.canal = 0;
        this.estado = "";
    }

    public Televisao(int volume, int canal, String estado) {
        this.volume = volume;
        this.canal = canal;
        this.estado = estado;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String tvDesligado(){
        return this.estado = "Televisão desligada!";
    }


    public int aumentarVolume(int aumentarVolume) {
        return this.volume += aumentarVolume;
    }
    public int diminuirVolume(int diminuirVolume) {
        return this.volume - diminuirVolume;
    }
    public int trocarCanal(int trocarCanal) {
        return this.canal = trocarCanal;
    }




    public String toString(){
        return "Ligado/Desligado: " + getEstado() + "\nVolume: " + this.volume + "\nCanal: " + this.canal;
    }



}
