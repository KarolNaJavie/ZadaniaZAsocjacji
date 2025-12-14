package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia; //atrybut wyliczalny
    private String tytulNaukowy; //atrybut opcjonalny
    private Adres adres;
    private List<Osoba> znajomiNaFb = new ArrayList<>();

    public Osoba(String imie, String nazwisko, int rokUrodzenia, String tytulNaukowy, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.tytulNaukowy = tytulNaukowy;
        this.adres = adres;
    }

    public Osoba(String imie, String nazwisko, int rokUrodzenia, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.adres = adres;
    }

    public void dodajZnajomego(Osoba osoba) {
        if (!znajomiNaFb.contains(osoba)) {
            znajomiNaFb.add(osoba);
        }
    }

    public void usunZnajomego(Osoba osoba){
        znajomiNaFb.remove(osoba);
    }

    public List<Osoba> getZnajominaFb(){
        return znajomiNaFb;
    }

    public int getWiek(){
        return LocalDate.now().getYear() - rokUrodzenia;
    }

    public void setTytulNaukowy(String tytulNaukowy) {
        this.tytulNaukowy = tytulNaukowy;
    }

    @Override
    public String toString() {
        String prefixTytul = (tytulNaukowy != null) ? tytulNaukowy + " " : "";
        return prefixTytul + imie + " " + nazwisko + " " + getWiek() + " lat, adres: " + adres;
    }
}
