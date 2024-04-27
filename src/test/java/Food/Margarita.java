package Food;

import Food.Alcohol;

public class Margarita extends Alcohol {

    int age;
    public Margarita(String nm, int cl) {
        super(nm, cl);
    }

    @Override
    public void drink() {
        System.out.println("Enjoy your drink");

    }


}
