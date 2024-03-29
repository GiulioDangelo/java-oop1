package org.experis.bonus1;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class ContoBonus {
    private int id;
    private String name;
    private BigDecimal balance;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);


    ContoBonus(String name ) {
        this.name = name;
        this.id = rand.nextInt(1000);
        this.balance = BigDecimal.ZERO;
    }


    void menu() {
        System.out.println("se vuoi versare premi 1");
        System.out.println("se vuoi prelevare premi 2");
        System.out.println("se vuoi uscire premi 3");
        int temp = scan.nextInt();

        do {
            if (temp == 1) {
                System.out.println("quanto vuoi versare?");
                BigDecimal amount = scan.nextBigDecimal();
                add(amount);
            } else if (temp == 2) {
                System.out.println("quanto vuoi prelevare?");
                BigDecimal amount = scan.nextBigDecimal();
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

    BigDecimal getBalance() {
        return this.balance;
    }

    BigDecimal add(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        System.out.println("hai versato " + this.balance + "$");
        return this.balance;
    }

    BigDecimal withdraw (BigDecimal amount) {
        if (this.balance.compareTo(amount) > 0) {
            this.balance = this.balance.subtract(amount);
             System.out.println("hai prelevato " + this.balance + "$");
        } else {
             System.out.println("errore, non hai abbastanza saldo per prelevare " + amount + "$");
             menu();
        }
        return this.balance;
    }

}
