package ru.mts;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createTen = new CreateAnimalService();
        CreateAnimalServiceImpl createCount = new CreateAnimalServiceImpl(5);

        createTen.createAnimals();
        System.out.println("=======================================");
        System.out.println("=======================================");
        createCount.createAnimals();
        System.out.println("=======================================");
        System.out.println("=======================================");
        createCount.createAnimals(4);
    }

}
