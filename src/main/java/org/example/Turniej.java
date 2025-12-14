package org.example;

public class Turniej {
    private String nazwa;
    private String miesiac;

    public Turniej(String nazwa, String miesiac) {
        this.nazwa = nazwa;
        this.miesiac = miesiac;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
