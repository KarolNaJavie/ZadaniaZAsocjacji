package org.example;

public class WychowawcaTymczasowy {
    private Wychowawca wychowawca;
    private double income;

    public WychowawcaTymczasowy(Wychowawca wychowawca, double income) {
        this.wychowawca = wychowawca;
        this.income = wychowawca.getIncome();
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
