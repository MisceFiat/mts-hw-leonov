package ru.mts;

public class CreateAnimalServiceImpl implements CreateAnimalService{


    @Override
    public void createAnimals() {
        int i = 10;
        do{
            Animal animal = AnimalFarm.processCreation();
            AnimalFarm.callAnimal(animal);
            System.out.println();
            i--;
        } while (i>0);
    }

    public void createAnimals(int i) {
        for (;i>0;i--){
            Animal animal = AnimalFarm.processCreation();
            AnimalFarm.callAnimal(animal);
            System.out.println();
        }
    }

}
