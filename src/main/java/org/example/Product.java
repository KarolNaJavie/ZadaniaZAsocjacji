package org.example;

public class Product {
    private String name;
    private double price;
    private int condomSize;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int condomSize) {
        this.name = name;
        this.price = price;
        this.condomSize = condomSize;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCondomSize() {
        return condomSize;
    }
}
