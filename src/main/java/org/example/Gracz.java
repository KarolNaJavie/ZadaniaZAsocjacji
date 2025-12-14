package org.example;

import java.util.HashMap;
import java.util.Map;

public class Gracz {
    private String imie;
    private String nazwisko;
    private Map<Turniej, Integer> wyniki = new HashMap<>();
    private Integer iloscPierwszychMiejsc = 0;
    private Integer punktacja = 0;

    public Gracz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void dodajWynik(Turniej turniej, Integer miejsce) {
        wyniki.put(turniej, miejsce);
        if (miejsce == 1) {
            iloscPierwszychMiejsc++;
        }
        punktacja = +this.punkty(turniej);
    }

    public Integer getPunktacja() {
        return punktacja;
    }

    public Integer miejsce(Turniej turniej) {
        return wyniki.get(turniej);
    }

    public Integer punkty(Turniej turniej) {
        for (Map.Entry<Turniej, Integer> wynik : wyniki.entrySet()) {
            if (wynik.getValue() == 1) {
                return 100;
            } else if (wynik.getValue() == 2) {
                return 80;
            } else if (wynik.getValue() == 3) {
                return 60;
            } else if (wynik.getValue() == 4) {
                return 40;
            } else if (wynik.getValue() == 5) {
                return 20;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public void wyniki() {
        System.out.println("Wyniki gracza: " + imie + " " + nazwisko);
        for (Map.Entry<Turniej, Integer> wynik : wyniki.entrySet()) {
            System.out.println(wynik.getKey() + " -miejsce #" + wynik.getValue());
        }
    }

    public Integer getIloscPierwszychMiejsc() {
        return iloscPierwszychMiejsc;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
