package org.example;

public class InternationalTravel extends Travel implements HasPrice {

    private int price = 643;

    @Override
    public int getPrice() {
        return price;
    }
}
