package org.example;

public class Main {
    public static void main(String[] args) {
        InternationalTravel tripToRedSea = new InternationalTravel();
        System.out.println(tripToRedSea.getPrice());

        Destination home = new Destination("München",0, "Germany");
        Destination here = new Destination("Basel",0, "Switzerland");

        String country = here.country();
        System.out.println(country);
    }
}