package org.example;

import java.util.ArrayList;
import java.util.List;

public class Nauczyciel {
    private String imie;
    private String nazwisko;
    private String dataZatrudnienia;
    private List<Jezyk> jezykiNauczane = new ArrayList<>();
    private List<Student> studenciNauczani = new ArrayList<>();
    private int liczbaLekcji = 0;

    public Nauczyciel(String imie, String nazwisko, String dataZatrudnienia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public void dodajJezykNauzania(Jezyk jezyk) {
        jezykiNauczane.add(jezyk);
    }

    public void dodajStudenta(Student student) {
        studenciNauczani.add(student);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public List<Jezyk> getJezykiNauczane() {
        return jezykiNauczane;
    }

    public List<Student> getStudenciNauczani() {
        return studenciNauczani;
    }

    public void dodajLekcje() {
        liczbaLekcji++;
    }

    public int getLiczbaLekcji() {
        return liczbaLekcji;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
