package ru.mts;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl create = new CreateAnimalServiceImpl();
        create.createAnimals(3);
        create.createAnimals();
    }
}