package org.experis.esercizio1;
import java.util.Random;

public class Prodotto {
    private int id;
    private String name;
    private String description;
    private double price;
    private int iva = 22;


    Random rand = new Random();
    Prodotto(String name,String description, double price) {
        id = rand.nextInt(100000000);

        this.name = name;
        this.description = description;
        this.price = price;
    }


    double getBasePrice() {
        return price;
    }

    double getFullPrice() {
        double totalPrice = price + (price * ((double) iva / 100));
        return Math.round(totalPrice * 100.0) / 100.0;
    }

    String getFullName() {
       return String.format("%08d", id) + "-" + name;
    }
}
