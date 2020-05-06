package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName;
    private double additionPrice;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition(String name, double price) {
        this.additionName = name;
        this.additionPrice = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll" + " with " + this.meat + " price is " + this.price);
        if(this.additionName != null) {
            hamburgerPrice += this.additionPrice;
            System.out.println("Added " + this.additionName + " for an extra " + this.additionPrice);
        }
        return hamburgerPrice;
    }
}
