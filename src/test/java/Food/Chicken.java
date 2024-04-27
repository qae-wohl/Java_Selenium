package Food;

public class Chicken extends Protein {

//    This class already inherits the following:
//    Name
//    Calories
//    ProteinCount
    int temp;
    public Chicken(String nam, int cal) {
        super(nam, cal);
    }


    public void cook(int temp) {
        this.temp = temp;
        if (temp < 165) {
            System.out.println("Chicken is RAAAAAAAAWWWWWWW! ");
        } else {
            System.out.println("Make sure to cook your chicken well!");
        }
    }


}
