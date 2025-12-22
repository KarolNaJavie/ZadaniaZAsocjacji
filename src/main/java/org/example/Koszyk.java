package org.example;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    private List<Artykul> artykuly = new ArrayList<>();
    private Kupujacy wlascicielKoszyka;

    public void dodajArtykul(Artykul artykul) {
        artykuly.add(artykul);
    }

    public void setWlascicielKoszyka(Kupujacy wlascicielKoszyka) {
        this.wlascicielKoszyka = wlascicielKoszyka;
    }

    public Kupujacy getWlascicielKoszyka() {
        return wlascicielKoszyka;
    }

    public List<Artykul> getArtykuly() {
        return artykuly;
    }
}
