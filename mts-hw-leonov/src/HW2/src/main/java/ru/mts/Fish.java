package ru.mts;

public class Fish extends Predator {
    public Fish(String breed, String name, String cost, String character){
        super (breed, name, cost, character);
    }

    public void whoAmI(){
        System.out.println("I'm fish!");
    }
}
