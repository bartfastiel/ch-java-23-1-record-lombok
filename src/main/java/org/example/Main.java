package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        InternationalTravel tripToRedSea = new InternationalTravel();
        System.out.println(tripToRedSea.getPrice());

        Destination home = new Destination("München", new BigDecimal("0.1"), "Germany");
        Destination here = new Destination("Basel",new BigDecimal("0.2"), "Switzerland");

        String country = here.country();
        System.out.println(country);

        System.out.println(0.1 + 0.2);

        BigDecimal x = new BigDecimal("0.1");
        System.out.println(x.add(new BigDecimal("0.2")));

        new Course(Subject.MATH);

    }
}