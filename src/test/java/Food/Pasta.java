package Food;

import Food.Carbohydrates;

public class Pasta extends Carbohydrates {
    public Pasta(String nm, int cl) {
        super(nm, cl);
    }

    public  void cook (boolean water) {
            if (water) {
                System.out.println("Cooked Pasta!");

            }
        }
    public static void main (String[] args) {

        System.out.println();
    }

    }
