package Food;

import Food.Food;

public class Protein extends Food {

    int proteinCount;

    public Protein(String nam, int cal) {
        super(nam, cal);
        this.proteinCount = calories/40;

    }

    @Override
    void eat() {
        System.out.println("Enjoy good muscle growth");
    }

    @Override
    void cook() {
        System.out.println("You must apply heat to cook protein properly");
    }

}
