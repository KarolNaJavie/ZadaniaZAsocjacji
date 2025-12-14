package org.example;

import java.util.ArrayList;
import java.util.List;

public class NieposluszneDziecko {
    private Dziecko dziecko;
    private List<String> przewinienia = new ArrayList<>();
    private Integer liczbaPrzewinien = 0;
    private static NieposluszneDziecko worst;
    public NieposluszneDziecko(Dziecko dziecko) {
        this.dziecko = dziecko;
    }

    public Dziecko getDziecko() {
        return dziecko;
    }

    public List<String> getPrzewinienia() {
        return przewinienia;
    }

    public void addPrzewinienia(String przewinienia) {
        this.przewinienia.add(przewinienia);
        liczbaPrzewinien++;
    }
    public static void getWorst(List<NieposluszneDziecko> nieposluszneDzieci){
        for (NieposluszneDziecko nieposluszneDziecko : nieposluszneDzieci){
            if ((worst == null) || (nieposluszneDziecko.liczbaPrzewinien > worst.liczbaPrzewinien)){
                worst = nieposluszneDziecko;
            }
        }
        System.out.println("Najgorsze dziecko to: " + " " + worst.getDziecko().getName() + " " + worst.getDziecko().getLastName());
    }
}
