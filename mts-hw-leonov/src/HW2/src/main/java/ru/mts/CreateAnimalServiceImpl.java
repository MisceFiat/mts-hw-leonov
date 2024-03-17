package ru.mts;

public class CreateAnimalServiceImpl extends CreateAnimalService{
    int i;
    public CreateAnimalServiceImpl(int countOfAnimals){
        i = countOfAnimals;
    }
    @Override
    public void createAnimals() {
        for (;i>0;i--){
            processCreation();
            System.out.println("");
        }
    }

    public void createAnimals(int count) {
        do{
            processCreation();
            System.out.println("");
            count--;
        } while (count>0);
    }
}
