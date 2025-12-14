package org.example;

import java.util.ArrayList;
import java.util.List;

public class PosluszneDziecko {
    private Dziecko dziecko;
    private String odznaka;

    public PosluszneDziecko(Dziecko dziecko, String odznaka) {
        this.dziecko = dziecko;
        this.odznaka = odznaka;
    }

    public Dziecko getDziecko() {
        return dziecko;
    }

    public String getOdznaka() {
        return odznaka;
    }
}
