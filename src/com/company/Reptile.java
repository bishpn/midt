package com.company;

public class Reptile extends Inmate{
    public Reptile(String name, double price) {
        super(name, price);
    }

    @Override
    public void live() {
        System.out.println("Reptiles adapted to life in marine and brackish environments.");
    }
}
