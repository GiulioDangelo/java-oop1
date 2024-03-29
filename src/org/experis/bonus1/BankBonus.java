package org.experis.bonus1;

import java.math.BigDecimal;

public class BankBonus {
    public static void main(String[] args) {
        ContoBonus conto1 = new ContoBonus("giulio");

        conto1.add(new BigDecimal(20));
        conto1.withdraw(new BigDecimal(10));
        conto1.menu();
        System.out.println("il tuo nome è: " + conto1.getName());
        System.out.println("il tuo id è: " + conto1.getId());
        System.out.println("il tuo bilancio è: " + conto1.getBalance());
    }
}
