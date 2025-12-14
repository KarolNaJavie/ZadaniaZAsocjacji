package org.example;

public class Kot extends Zwierze {
    private int stopienWkurwiania;

    public Kot(String nazwa, String gatunek, int stopienWkurwiania) {
        super(nazwa, gatunek);
        this.stopienWkurwiania = stopienWkurwiania;
    }
}
