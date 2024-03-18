package ru.mts;
import java.util.Random;

public class AnimalFarm {
    private static final String[] names = {"Sunny", "Honey", "Sweety", "Fluffy", "Funny", "Lucky", "Bubba", "Piggy", "Mouse"};
    private static final String[] breeds = {"blue", "white", "yellow", "black", "therier", "pink", "big", "not very big", "smol (not small)"};
    private static final String[] characters = {"lawful good", "neutral good", "chaotic good", "lawful neutral", "neutral neutral", "chaotic neutral", "lawful evil", "neutral evil", "chaotic evil"};
    private static final String[] costs = {"7", "9", "19", "200", "100500", "97979", "0.20063", "80", "80.1", "80.2", "2 beer"};

    public static String selectName(int l) {
        return names[l];
    }

    public static int nameCount() {
        return names.length;
    }

    public static String selectBreed(int l) {
        return breeds[l];
    }

    public static int breedCount() {
        return breeds.length;
    }

    public static String selectCharacter(int l) {
        return characters[l];
    }

    public static int characterCount() {
        return characters.length;
    }

    public static String selectCost(int l) {
        return costs[l];
    }

    public static int costCount() {
        return costs.length;
    }


    public static Animal processCreation() {
        Random r = new Random();
        int animalType = r.nextInt(4);
        int numBreed = r.nextInt(AnimalFarm.breedCount());
        int numName = r.nextInt(AnimalFarm.nameCount());
        int numCost = r.nextInt(AnimalFarm.costCount());
        int numCharacter = r.nextInt(AnimalFarm.characterCount());

        switch (animalType) {
            case 0:
                Cat cat = new Cat(
                        AnimalFarm.selectBreed(numBreed),
                        AnimalFarm.selectName(numName),
                        AnimalFarm.selectCost(numCost),
                        AnimalFarm.selectCharacter(numCharacter)
                );
                cat.whoAmI();
                return cat;

            case 1:
                Fish fish = new Fish(
                        AnimalFarm.selectBreed(numBreed),
                        AnimalFarm.selectName(numName),
                        AnimalFarm.selectCost(numCost),
                        AnimalFarm.selectCharacter(numCharacter)
                );
                fish.whoAmI();
                return fish;

            case 2:
                Goat goat = new Goat(
                        AnimalFarm.selectBreed(numBreed),
                        AnimalFarm.selectName(numName),
                        AnimalFarm.selectCost(numCost),
                        AnimalFarm.selectCharacter(numCharacter)
                );
                goat.whoAmI();
                return goat;

            case 3:
                Bird bird = new Bird(
                        AnimalFarm.selectBreed(numBreed),
                        AnimalFarm.selectName(numName),
                        AnimalFarm.selectCost(numCost),
                        AnimalFarm.selectCharacter(numCharacter)
                );
                bird.whoAmI();
                return bird;

        }
        return null;
    }

    public static void callAnimal(Animal animal) {
        animal.getName();
        animal.getCharacter();
        animal.getBreed();
        animal.getCost();
    }
}




