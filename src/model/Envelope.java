package model;

public class Envelope {
    private String arma;
    private String assassino;
    private String lugar;


    public void setArma(String arma) {
        this.arma = arma;
    }

    public void setAssasino(String assassino) {
        this.assassino = assassino;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getArma() {
        return this.arma;
    }

    public String getAssassino() {
        return this.assassino;
    }

    public String getLugar() {
        return this.lugar;
    }
    
}
