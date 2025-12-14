package org.example;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    private List<Artykul> artykuly = new ArrayList<>();

    public void dodajArtykul(Artykul artykul) {
        artykuly.add(artykul);
    }
}
