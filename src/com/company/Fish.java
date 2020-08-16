package com.company;

public class Fish extends Inmate{

    public Fish(String name, double price) {
        super(name, price);
    }

    @Override
    public void live() {
        System.out.println("Fishes adapted to life only in marine.");
    }
}
