package org.example;

public class Durex extends Product {
    private int condomSize;

    public Durex(String name, double price) {
        super(name, price);
    }

    public Durex(String name, double price, int condomSize) {
        super(name, price);
        this.condomSize = condomSize;
    }

    public int getCondomSize() {
        return condomSize;
    }

}
