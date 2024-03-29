package org.experis.bonus2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class ProdottoBonus {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva = BigDecimal.valueOf(0.22);


    Random rand = new Random();
    ProdottoBonus(String name, String description, BigDecimal price) {
        id = rand.nextInt(100000000);

        this.name = name;
        this.description = description;
        this.price = price;
    }


    BigDecimal getBasePrice() {
        return price;
    }

    BigDecimal getFullPrice() {
        BigDecimal ivaAmount = price.multiply(iva);
        BigDecimal totalPrice = price.add(ivaAmount);
        return totalPrice.setScale(2, RoundingMode.HALF_UP);
    }

    String getFullName() {
       return String.format("%08d", id) + "-" + name;
    }
}
