package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trener {
    private String imie;
    private String nazwisko;
    private String adres;
    private List<Zwierze> trenowaneZwierzeta = new ArrayList<>();

    public Trener(String imie, String nazwisko, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public void trenujZwierze(Zwierze zwierze) {
        if (zwierze.getTrener() == null) {
            trenowaneZwierzeta.add(zwierze);
            zwierze.setTrener(this);
        }
    }

    public List<Zwierze> getTrenowaneZwierzeta() {
        return trenowaneZwierzeta;
    }

    public void uzyjSprzetu(Sprzet sprzet) {
        if (Objects.equals(sprzet.getStopienZuzycia(), "nowy")) {
            sprzet.setStopienZuzycia("uzywany");
            sprzet.getHistoriaUzycia().put(this, sprzet.getHistoriaUzycia().getOrDefault(this, 0) + 1);
        } else if (Objects.equals(sprzet.getStopienZuzycia(), "uzywany")) {
            sprzet.setStopienZuzycia("tragiczny");
            sprzet.getHistoriaUzycia().put(this, sprzet.getHistoriaUzycia().getOrDefault(this, 0) + 1);
        } else {
            System.out.println("Nie mozna uzyc sprzetu");
        }
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
