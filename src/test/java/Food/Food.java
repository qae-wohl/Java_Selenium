package Food;

public abstract class Food {

    String name;
    int calories;


    public Food(String nm, int cl) {
        this.name = nm;
        this.calories = cl;
    }

    abstract void eat();
    abstract void cook();



}
