package com.company;

public class Accessory {
    private String name;
    private double price;

    public Accessory(){}

    public Accessory(String name, double price){
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Accessory '" + name + "', which costs " + price + " tenges.";
    }
}
