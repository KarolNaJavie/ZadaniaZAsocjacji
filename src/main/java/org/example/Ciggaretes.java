package org.example;

public class Ciggaretes extends Product {
    private String taste;

    public Ciggaretes(String name, double price, String taste) {
        super(name, price);
        this.taste = taste;
    }
}
