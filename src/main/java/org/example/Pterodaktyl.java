package org.example;

public class Pterodaktyl extends Zwierze {
    private int rozpietoscSkrzydel;

    public Pterodaktyl(String nazwa, String gatunek, int rozpietoscSkrzydel) {
        super(nazwa, gatunek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }
}
