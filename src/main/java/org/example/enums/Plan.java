package org.example.enums;

public enum Plan {
    BASIC(5, "Eren");

    private final int price;
    private final String name;


    Plan( int price, String name) {
        this.price = price;
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
