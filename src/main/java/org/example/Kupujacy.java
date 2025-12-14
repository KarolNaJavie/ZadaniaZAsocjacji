package org.example;

import java.util.ArrayList;
import java.util.List;

public class Kupujacy {
    private String imie;
    private String nazwisko;
    private String adres;
    private String dataRejestracji;
    private List<Koszyk> koszyki = new ArrayList<>();
    private List<Koszyk> historiaKoszykow = new ArrayList<>();

    public Kupujacy(String imie, String nazwisko, String adres, String dataRejestracji) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.dataRejestracji = dataRejestracji;
    }

    public void dodajKoszyk(Koszyk koszyk) {
        koszyki.add(koszyk);
    }

    public void finalizujKoszyk(Koszyk koszyk) {
        if (koszyki.contains(koszyk)) {
            koszyki.remove(koszyk);
            historiaKoszykow.add(koszyk);
            System.out.println("koszyk przeniesiony do histori");
        } else {
            System.out.println("Klient nie ma takiego koszyka!");
        }
    }

}
