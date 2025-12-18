package org.example;

public class Product {
    private String name;
    private double price;
    private Client client;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setClient (Client client) {
        this.client = client;
    }

    public Client getClient () {
        return client;
    }



}
