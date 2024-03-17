package ru.mts;
import java.util.Random;
public class CreateAnimalService {

    public static void callAnimal(Animal animal) {
        animal.getName();
        animal.getCharacter();
        animal.getBreed();
        animal.getCost();
    }

    protected static void processCreation() {
        Random r = new Random();

        int animalType = r.nextInt(4);
        int numBreed = r.nextInt(SetVariable.breedCount());
        int numName = r.nextInt(SetVariable.nameCount());
        int numCost = r.nextInt(SetVariable.costCount());
        int numCharacter = r.nextInt(SetVariable.characterCount());

        switch (animalType) {
            case 0:
                Cat cat = new Cat(
                        SetVariable.selectBreed(numBreed),
                        SetVariable.selectName(numName),
                        SetVariable.selectCost(numCost),
                        SetVariable.selectCharacter(numCharacter)
                );
                cat.whoAmI();
                callAnimal(cat);
                cat.specialAction();
                break;
            case 1:
                Fish fish = new Fish(
                        SetVariable.selectBreed(numBreed),
                        SetVariable.selectName(numName),
                        SetVariable.selectCost(numCost),
                        SetVariable.selectCharacter(numCharacter)
                );
                fish.whoAmI();
                callAnimal(fish);
                fish.specialAction();
                break;
            case 2:
                Goat goat = new Goat(
                        SetVariable.selectBreed(numBreed),
                        SetVariable.selectName(numName),
                        SetVariable.selectCost(numCost),
                        SetVariable.selectCharacter(numCharacter)
                );
                goat.whoAmI();
                callAnimal(goat);
                goat.specialAction();
                break;
            case 3:
                Bird bird = new Bird(
                        SetVariable.selectBreed(numBreed),
                        SetVariable.selectName(numName),
                        SetVariable.selectCost(numCost),
                        SetVariable.selectCharacter(numCharacter)
                );
                bird.whoAmI();
                callAnimal(bird);
                bird.specialAction();
                break;
        }
    }

    public void createAnimals() {
        int i = 10;
        while (i > 0) {
            processCreation();
            System.out.println();
            i--;
        }
    }
}
