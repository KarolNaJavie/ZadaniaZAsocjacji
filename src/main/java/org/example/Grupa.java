package org.example;

import java.util.ArrayList;
import java.util.List;

public class Grupa {
    private WychowacaKwalifikowany wychowawca;
    private List<Dziecko> grupa = new ArrayList<>();
    private int limitDzieci = 15;
    private Sala sala;

    public Grupa(WychowacaKwalifikowany wychowawca, Sala sala) {
        this.wychowawca = wychowawca;
        this.sala = sala;
    }

    public void addDziecko(Dziecko dziecko) {
        if (limitDzieci <= 15) {
            grupa.add(dziecko);
            limitDzieci++;
        } else {
            System.out.println("Grupa jest juz pelna!");
        }
    }
}
