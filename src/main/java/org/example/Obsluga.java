package org.example;

public class Obsluga extends Czlowiek {

    private String dataRozpoczeciaPracy;
    private boolean menadzer;

    public Obsluga(String imie, String nazwisko, AdresZamieszkania adres, String dataRozpoczeciaPracy) {
        super(imie, nazwisko, adres);
        this.dataRozpoczeciaPracy = dataRozpoczeciaPracy;
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
