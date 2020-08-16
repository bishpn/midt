package com.company;

import com.company.Accessory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Aquarium aquarium = new Aquarium();
//        aquarium.addInmate(new Fish("Gold Fish", 50));
//        aquarium.addInmate(new Fish("Swordfish", 150));
//        aquarium.addAccessory(new Accessory("Prison", 30));
//        System.out.println(aquarium.toString());

        File file = new File("C:\\Users\\lenovo\\IdeaProjects\\midt\\Aquarium.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String type = sc.nextLine();
            if(type.toLowerCase().equals("accessory")){
                Accessory accessory = new Accessory(sc.nextLine(),sc.nextInt());
                aquarium.addAccessory(accessory);
            }else if (type.toLowerCase().equals("fish")){
                Fish fish = new Fish(sc.nextLine(),sc.nextInt());
                aquarium.addInmate(fish);
            }else if(type.toLowerCase().equals("reptile")){
                Reptile reptile = new Reptile(sc.nextLine(),sc.nextInt());
                aquarium.addInmate(reptile);
            }
        }
        System.out.println(aquarium.toString());
        System.out.println(aquarium.getPrice());
    }
}
