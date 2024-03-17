package ru.mts;

public class Bird extends Herbivore{
    public Bird(String breed, String name, String cost, String character){
        super(breed,name,cost,character);
    }

    public void whoAmI(){
        System.out.println("I'm bird!");
    }
}
