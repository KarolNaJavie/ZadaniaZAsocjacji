package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Sprzet {
    private String nazwa;
    private String stopienZuzycia;
    private int liczbaNapraw = 0;
    private Map<Trener, Integer> historiaUzycia = new HashMap<>();

    public Sprzet(String nazwa, String stopienZuzycia) {
        this.nazwa = nazwa;
        this.stopienZuzycia = stopienZuzycia;
    }

    public String getStopienZuzycia() {
        return stopienZuzycia;
    }

    public void setStopienZuzycia(String stopienZuzycia) {
        this.stopienZuzycia = stopienZuzycia;
    }

    public void napraw() {
        if (Objects.equals(stopienZuzycia, "tragiczny")) {
            System.out.println("Sprzet naprawiony");
            stopienZuzycia = "uzywany";
            liczbaNapraw++;
        } else {
            System.out.println("Nie mozna naprawic sprzetu, jest jeszcze w dobrym stanie");
        }
    }


    public int getLiczbaNapraw() {
        return liczbaNapraw;
    }

    public Map<Trener, Integer> getHistoriaUzycia() {
        return historiaUzycia;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}

