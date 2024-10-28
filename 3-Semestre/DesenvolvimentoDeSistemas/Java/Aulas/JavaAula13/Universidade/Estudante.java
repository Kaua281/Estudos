package Universidade;

public class Estudante extends Pessoa {
    private String estatuto;
    private double media;

    public Estudante(String nome, String estatuto, double media) {
        super(nome);
        this.estatuto = estatuto;
        this.media = media;
    }

    public void setEstatuto(String estatuto) {
        this.estatuto = estatuto;
    }

    public String getEstatuto() {
        return estatuto;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMedia() {
        return media;
    }
}