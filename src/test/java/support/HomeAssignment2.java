package support;

import java.lang.annotation.Target;

public class HomeAssignment2 {
    public static void main(String[] args) {

        printArray();
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        isItFridayYet(weekDays);
    }
    public static void printArray() {

        int[] ages = {59, 78, 49, 70};
        String[] names = {"Nancy", "Bernie", "Jenn", "Jordan"};
        boolean[] sex = {false, true, false, true};

        // table header
        System.out.println("Name\tAge\tSex");
        System.out.println();

        // Prints each line of a provided Array
        for (int i = 0; i < ages.length; i++) {
            System.out.println(names[i] + "\t" + ages[i] + "\t" + (sex[i] ? "Male" : "Female"));
        }

        System.out.println();
    }
    /*

    Create me a method called isItFridayYet()
    that will accept an Array of days.
    It will go through each value and print it out until
    it reaches the value Friday
    then it will give a custom message “TGIF!”

     */

    public static void isItFridayYet(String[] array) {

        // Header
        System.out.println("Let's check if it is Friday!");
        System.out.println();

        // Prints each line of a provided Array
        for (int i = 0; i < array.length; i++) {
            String weekDay = array[i];
            if (weekDay == "Friday") {
                System.out.println("TGIF!");
            } else {
                System.out.println("It is " + array[i]);
            }
        }
        System.out.println();
    }


}