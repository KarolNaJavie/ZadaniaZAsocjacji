package org.example;

public class Zwierze {
    private String nazwa;
    private String gatunek;
    private Trener trener;

    public Zwierze(String nazwa, String gatunek) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
