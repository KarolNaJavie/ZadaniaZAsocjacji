package org.example;

import java.util.ArrayList;
import java.util.List;

public class Kupujacy extends Czlowiek {
    private String dataRejestracji;
    private List<Koszyk> koszyki = new ArrayList<>();
    private List<Koszyk> historiaKoszykow = new ArrayList<>();

    public Kupujacy(String imie, String nazwisko, AdresZamieszkania adres, String dataRejestracji) {
        super(imie, nazwisko, adres);
        this.dataRejestracji = dataRejestracji;
    }

    public void dodajKoszyk(Koszyk koszyk) {
        koszyki.add(koszyk);
        koszyk.setWlascicielKoszyka(this);

    }

    public void finalizujKoszyk(Koszyk koszyk) {
        if (koszyki.contains(koszyk)) {
            koszyki.remove(koszyk);
            historiaKoszykow.add(koszyk);
            System.out.println("koszyk przeniesiony do historii");
        } else {
            System.out.println("Klient nie ma takiego koszyka!");
        }
    }

}
