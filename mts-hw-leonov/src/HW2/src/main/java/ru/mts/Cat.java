package ru.mts;

public class Cat extends Predator{
    public Cat(String breed, String name, String cost, String character){
        super(breed,name,cost,character);
    }
    public void whoAmI(){
        System.out.println("I'm cat!");
    }
}
