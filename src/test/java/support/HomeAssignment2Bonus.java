package support;

    /*
    Bonus: methods with if/else, switch, and loops

    Due February 22, 2024 6:00 PM
    Instructions:
    1) Create me a method that counts “Mississippi” from 1 number UP TO desired number.
       (Input: Target 3; Output: 1 Mississippi, 2 Mississippi, 3 Mississippi )
    */


public class HomeAssignment2Bonus {
    public static void main(String[] args) {

        int Target = 5;
        countMississippi(Target);

        japCarsClub("Mazda");

        fooBarLogic1("bar");
    }

    public static void countMississippi (int Target) {
        System.out.println("Counting Mississippi");
        for (int i = 1; i <= Target; i++) {
            System.out.println(i + " Mississippi");
        }
        System.out.println();
    }

//     2) Create me a method that chooses a character from your favorite game/tv show/celebrity and prints out their name and some message. (use switch)
//        (Input: String Iron Man; Output: "His real super power is money and daddy issues)

    public static void japCarsClub(String carMake){
        String model = "";
        switch (carMake) {
            case "Toyota":
                model = "Supra - Flies like a rocket";
                break;
            case "Nissan":
                model = "GTR - Drags like a train";
                break;
            case "Mazda":
                model = "RX7 - Glides like a feather";
                break;
            default:
                model = "Try another Japanese Make";
        }

        System.out.println(model);
        System.out.println();
    }

//     3) Create me a method that chooses between foo and bar and prints out a custom message for each. If the input is not foo or bar, then return an invalid message
//        (Input: foo ; Output: foo is valid)
//

    public static void fooBarLogic1 (String instance) {
        if (instance == "foo") {
            System.out.println(instance + " is valid");
        } else if (instance == "bar") {
            System.out.println(instance + " is invalid");
        } else {
            System.out.println("Wrong!!! Enter either 'foo' or 'bar', please!");
        }
    }


}