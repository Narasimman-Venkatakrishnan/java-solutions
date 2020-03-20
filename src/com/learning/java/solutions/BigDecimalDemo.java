package com.learning.java.solutions;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {

        BigDecimal euro, cents;

        cents = new BigDecimal(504);

        euro = cents.movePointRight(-2);// 2 points right

        cents = euro.movePointRight(2);

        System.out.println(cents + " Cents is equal to " + euro + " Euro");

        System.out.println(euro + " Euro is equal to " + cents + " Cents");

    }
}
