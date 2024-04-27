package Food;

public abstract class Alcohol extends Food {

    int bAC;
    int age;

    public Alcohol(String nm, int cl) {
        super(nm, cl);
        this.bAC = calories / 100;
    }

    @Override
    void eat() {

    }

    public abstract void drink();


    @Override
    void cook() {

    }

    public void iDCheck(int age) {
        this.age = age;
        if (age < 21) {
            System.out.println("No drinks for you");
        }

    }
}
