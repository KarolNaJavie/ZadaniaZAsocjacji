package org.example;

public class Alkohol extends Product {
    private double litres;
    private int procent;

    public Alkohol(String name, double price, double litres, int procent) {
        super(name, price);
        this.litres = litres;
        this.procent = procent;
    }

}
