package ru.mts;

public class SetVariable {
    private static final String[] names = {"Sunny", "Honey", "Sweety", "Fluffy", "Funny", "Lucky", "Bubba", "Piggy", "Mouse"};
    private static final String[] breeds = {"blue", "white", "yellow", "black", "therier", "pink", "big","not very big", "smol (not small)"};
    private static final String[] characters = {"lawful good", "neutral good", "chaotic good", "lawful neutral", "neutral neutral", "chaotic neutral", "lawful evil", "neutral evil", "chaotic evil"};
    private static final String[] costs = {"7", "9", "19","200","100500","97979","0.20063","80","80.1","80.2","2 beer"};

    public static String selectName(int l){
        return names[l];
    }
    public static int nameCount(){
        return names.length;
    }

    public static String selectBreed(int l){
        return breeds[l];
    }
    public static int breedCount(){
        return breeds.length;
    }

    public static String selectCharacter(int l){
        return characters[l];
    }
    public static int characterCount(){
        return characters.length;
    }

    public static String selectCost(int l){
        return costs[l];
    }
    public static int costCount(){
        return costs.length;
    }
}
