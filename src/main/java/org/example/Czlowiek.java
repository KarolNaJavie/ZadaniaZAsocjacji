package org.example;

public class Czlowiek {
    private String imie;
    private String nazwisko;
    private AdresZamieszkania adres;

    public Czlowiek(String imie, String nazwisko, AdresZamieszkania adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public AdresZamieszkania getAdres() {
        return adres;
    }

    public void setAdres(AdresZamieszkania adres) {
        this.adres = adres;
    }
}
