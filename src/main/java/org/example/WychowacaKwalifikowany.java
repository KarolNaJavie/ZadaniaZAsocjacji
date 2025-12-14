package org.example;

import java.util.List;

public class WychowacaKwalifikowany {
    private Wychowawca wychowawca;
    private String kwalifikacje;
    private double income;

    public WychowacaKwalifikowany(Wychowawca wychowawca, String kwalifikacje) {
        this.wychowawca = wychowawca;
        this.kwalifikacje = kwalifikacje;
        this.income = wychowawca.getIncome();
    }

    public Wychowawca getWychowawca() {
        return wychowawca;
    }

    public String getKwalifikacje() {
        return kwalifikacje;
    }

    public void setKwalifikacje(String kwalifikacje) {
        this.kwalifikacje = kwalifikacje;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public static void wychowacyPowyzej(List<WychowacaKwalifikowany> wykfalifikowani, double limit) {
        System.out.println("\nWykfalifikowani wychowacy zarabiajacy ponad " + limit + " pln: ");
        for (WychowacaKwalifikowany wykfalifikowany : wykfalifikowani) {
            if (wykfalifikowany.income > limit) {
                System.out.println(wykfalifikowany.getWychowawca().getName() + " " + wykfalifikowany.getWychowawca().getLastName());
            }
        }
    }
}
