package support;

import java.util.Random;

public class MarvelHero {

    // Fields predefines basic information-characteristics
    private String supername;
    private String name;
    private boolean heroic;


    // Constructor to initialize the donut shop
    public MarvelHero(String supName, String regName) {
        this.supername = supName;
        this.name = regName;
        Random random = new Random();
        this.heroic = random.nextBoolean();

    }

    // Methods
    public void aetLeaves(int numberLeaves) {
    System.out.println(supername + " has eaten " + numberLeaves + " leaves today");
    }
    public void quip() {
        System.out.println("Here's it is!");
    }

    // Getters for the class fields
    public String getSupername() {return supername;}
    public String getName() {return name;}
    public  boolean getHeroic() {return heroic; }

}

