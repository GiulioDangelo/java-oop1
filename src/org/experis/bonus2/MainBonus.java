package org.experis.bonus2;

import java.math.BigDecimal;

public class MainBonus {
    public static void main(String[] args) {
        ProdottoBonus mela = new ProdottoBonus("mela","verde", BigDecimal.valueOf(1.50));

        System.out.println(mela.getFullPrice());
        System.out.println(mela.getFullName());


        ProdottoBonus pera = new ProdottoBonus("pera","gialla",BigDecimal.valueOf(2.10));

        System.out.println(pera.getFullPrice());
        System.out.println(pera.getFullName());
    }
}
