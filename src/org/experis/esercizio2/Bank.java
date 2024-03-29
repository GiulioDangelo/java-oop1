package org.experis.esercizio2;

public class Bank {
    public static void main(String[] args) {
        Conto conto1 = new Conto("giulio");

        conto1.add(20);
        conto1.withdraw(10);
        conto1.menu();
        System.out.println("il tuo nome è: " + conto1.getName());
        System.out.println("il tuo id è: " + conto1.getId());
        System.out.println("il tuo bilancio è: " + conto1.getBalance());
    }
}
