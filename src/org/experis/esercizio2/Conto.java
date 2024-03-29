package org.experis.esercizio2;

import java.util.Random;
import java.util.Scanner;

public class Conto {
    private int id;
    private String name;
    private double balance;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);


    Conto (String name ) {
        this.name = name;
        this.id = rand.nextInt(1000);
    }


    void menu() {
        System.out.println("se vuoi versare premi 1");
        System.out.println("se vuoi prelevare premi 2");
        System.out.println("se vuoi uscire premi 3");
        int temp = scan.nextInt();

        do {
            if (temp == 1) {
                System.out.println("quanto vuoi versare?");
                int amount = scan.nextInt();
                add(amount);
            } else if (temp == 2) {
                System.out.println("quanto vuoi prelevare?");
                int amount = scan.nextInt();
                withdraw(amount);
            } else if (temp == 3) {
                System.out.println("uscito");
                break;
            } else {
                System.out.println("inserisci un valore corretto");
                temp = scan.nextInt();
            }
        } while (temp < 0 || temp >= 3);
    }

    String getName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    double getBalance() {
        return this.balance;
    }

    void add(int amount) {
        this.balance += amount;
        System.out.println("hai versato " + this.balance + "$");
    }

    void withdraw (int amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
             System.out.println("hai prelevato " + this.balance + "$");
        } else {
             System.out.println("errore, non hai abbastanza saldo per prelevare " + amount + "$");
             menu();
        }
    }
}
