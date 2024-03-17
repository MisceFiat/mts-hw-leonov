package ru.mts;

public class Goat extends Herbivore{
    public Goat(String breed, String name, String cost, String character){
        super(breed,name,cost,character);
    }
    public void whoAmI(){
        System.out.println("I'm goat!");
    }
}
