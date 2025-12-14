package org.example;

public class Wychowawca {
    private String name;
    private String lastName;
    private String birthDate;
    private double income;

    public Wychowawca(String name, String lastName, String birthDate, double income) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
