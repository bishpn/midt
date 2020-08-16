package com.company;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Inmate> inmates;
    private List<Accessory> accessories;
    private double price;

    public Aquarium(){
        inmates = new ArrayList<>();
        accessories = new ArrayList<>();
        price = 0;
    }

    public List<Inmate> getInmates() {
        return inmates;
    }

    public void setInmates(List<Inmate> inmates) {
        this.inmates = inmates;
        for(Inmate inmate : inmates){
            price += inmate.getPrice();
        }
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
        for(Accessory accessory : accessories){
            price += accessory.getPrice();
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addInmate(Inmate inmate){
        inmates.add(inmate);
        price += inmate.getPrice();
    }

    public void addAccessory(Accessory accessory){
        accessories.add(accessory);
        price += accessory.getPrice();
    }

    @Override
    public String toString() {
        String inmatesAmount = (inmates.size()>1)? " inmates," : " inmate,";
        String accessoryAmout = (accessories.size()>1)? " accessories." : " accessory.";
        return "This aquarium consists of " + inmates.size()  + inmatesAmount +
                " and " + accessories.size() + accessoryAmout;
    }
}
