package org.example;

public class Pies extends Zwierze {
    private String dlugoscSiersci;
    private String ulubioneZabawki;

    public Pies(String nazwa, String gatunek, String dlugoscSiersci,
                String ulubioneZabawki) {
        super(nazwa, gatunek);
        this.dlugoscSiersci = dlugoscSiersci;
        this.ulubioneZabawki = ulubioneZabawki;
    }
}
