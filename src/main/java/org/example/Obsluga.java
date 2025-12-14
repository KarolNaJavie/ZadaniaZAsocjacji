package org.example;

public class Obsluga {
    private String imie;
    private String nazwisko;
    private String adres;
    private String dataRozpoczeciaPracy;
    private boolean menadzer;

    public Obsluga(String imie, String nazwisko, String adres, String dataRozpoczeciaPracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.dataRozpoczeciaPracy = dataRozpoczeciaPracy;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public String getDataRozpoczeciaPracy() {
        return dataRozpoczeciaPracy;
    }

    public void promocjaNaMenadzera() {
        menadzer = true;
    }

    public void cofnijMenadzera() {
        menadzer = false;
    }
}
