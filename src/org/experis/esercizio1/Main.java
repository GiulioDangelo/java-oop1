package org.experis.esercizio1;

public class Main {
    public static void main(String[] args) {
        Prodotto mela = new Prodotto("mela","verde",1.50);

        System.out.println(mela.getFullPrice());
        System.out.println(mela.getFullName());


        Prodotto pera = new Prodotto("pera","gialla",2.10);

        System.out.println(pera.getFullPrice());
        System.out.println(pera.getFullName());
    }
}
