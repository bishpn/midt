package com.company;

abstract class Inmate {
    private String name;
    private double price;

    public Inmate(String name,double price){
        setName(name);
        setPrice(price);
    }

    public abstract void live();

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
        return name + " ,which costs " + price + " tenges";
    }
}
