package Food;

public class Carbohydrates extends Food {

    int carbCount;
    public Carbohydrates(String nm, int cl) {
        super(nm, cl);
        this.carbCount = calories/40;
    }

    @Override
    void eat() {
        System.out.println("Store up that energy");

    }

    @Override
    void cook() {

        System.out.println("To cook carbs you must either bake or boil it");

    }
}
