package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Klient {
    private String name;
    private String lastName;
    private Produkt favourite;
    private List<Produkt> basket = new ArrayList<>();
    private double totalSpent = 0;
    private Map<Produkt, Integer> articleTrack = new HashMap<>();

    public Klient(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFavourite() {
        int bigValue = 0;
        for (Map.Entry<Produkt, Integer> entry : articleTrack.entrySet()) {
            if (entry.getValue() > bigValue) {
                bigValue = entry.getValue();
                favourite = entry.getKey();
            }
        }
        return favourite.getName();
    }

    public List<Produkt> getBasket() {
        return basket;
    }

    public void buy(String produktName, double produktPrice) {
        Produkt produkt = new Produkt(produktName, produktPrice);
        this.basket.add(produkt);
        totalSpent = +produktPrice;

        articleTrack.put(produkt, articleTrack.getOrDefault(produkt, 0) + 1);

    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public static void bestKlient(List<Klient> klienci) {
        Klient bestKlient = null;
        for (Klient klient : klienci) {
            if (bestKlient == null || klient.totalSpent > bestKlient.totalSpent) {
                bestKlient = klient;
            }
        }
        System.out.println("Best Client is: " + bestKlient.getName() + " " + bestKlient.getLastName());
    }
}
