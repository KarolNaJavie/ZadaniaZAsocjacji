package org.example;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String lastName;
    private int penisSize;
    private List<Product> basket = new ArrayList<>();
    private double totalPrice = 0;

    public Client(String name, String lastName) {
        this.name = name;
    }

    public Client(String name, String lastName, int penisSize) {
        this.name = name;
        this.lastName = lastName;
        this.penisSize = penisSize;
    }

    public void buy (Product product) {
        if (product.getClient() != null) {
            throw new IllegalArgumentException("Produkt jest juz zajety!");
        }

        basket.add(product);
        product.setClient(this);
        this.totalPrice = + product.getPrice();
    }

//    public void buy(String nameProduct, double productPrice) {
//        OthersProducts othersProducts = new OthersProducts(nameProduct, productPrice);
//        this.basket.add(othersProducts);
//        this.totalPrice = +productPrice;
//    }
//
//    public void buy(String nameProduct, double productPrice, String taste) {
//        Ciggaretes ciggaretes = new Ciggaretes(nameProduct, productPrice, taste);
//        this.basket.add(ciggaretes);
//        this.totalPrice = +productPrice;
//    }
//
//    public void buy(String productName, double productPrice, int productSize) {
//        Durex durex = new Durex(productName, productPrice, productSize);
//        this.basket.add(durex);
//        this.totalPrice = +productPrice;
//    }
//
//    public void buy(String productName, double productPrice, double litres, int procent) {
//        Alkohol alkohol = new Alkohol(productName, productPrice, litres, procent);
//        this.basket.add(alkohol);
//        this.totalPrice = +productPrice;
//    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPenisSize() {
        return penisSize;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static String bestBuyer(List<Client> clients) {
        Client bestBuyer = null;
        for (Client client : clients) {
            if (bestBuyer == null || bestBuyer.totalPrice < client.totalPrice) {
                bestBuyer = client;
            }
        }
        return bestBuyer.name + " " + bestBuyer.lastName;
    }

    public static void whoBuyCondom(List<Client> clients) {
        System.out.println("Condom buyers: ");
        for (Client client : clients) {
            for (Product product : client.getBasket()) {
                if (product instanceof Durex) {
                    System.out.println(client.name + " " + client.lastName);
                }
            }
        }

    }

    public static void whoPretendToHaveBiggerDick(List<Client> clients) {
        System.out.println("Pretenders: ");
        for (Client client : clients) {
            for (Product product : client.getBasket()) {
                if (product instanceof Durex && client.getPenisSize() == ((Durex) product).getCondomSize()) {
                    System.out.println(client.name + " " + client.lastName);
                }
            }
        }

    }
}
