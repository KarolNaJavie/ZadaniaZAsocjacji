package org.example;

public class AdresZamieszkania {
    private String miasto;
    private String ulica;
    private int nrBudynku;
    private int nrLokalu;
    private String kodPocztowy;

    public AdresZamieszkania(String miasto, String ulica, int nrBudynku, int nrLokalu, String kodPocztowy) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrBudynku = nrBudynku;
        this.nrLokalu = nrLokalu;
        this.kodPocztowy = kodPocztowy;
    }

    public AdresZamieszkania(String miasto, String ulica, int nrBudynku, String kodPocztowy) {
        this.miasto = miasto;
        this.ulica = ulica;
        this.nrBudynku = nrBudynku;
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getNrLokalu() {
        return nrLokalu;
    }

    public void setNrLokalu(int nrLokalu) {
        this.nrLokalu = nrLokalu;
    }

    public int getNrBudynku() {
        return nrBudynku;
    }

    public void setNrBudynku(int nrBudynku) {
        this.nrBudynku = nrBudynku;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

}
