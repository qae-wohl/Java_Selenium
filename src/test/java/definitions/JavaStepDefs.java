package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaStepDefs {
    @Given("I say hello world")
    public void iSayHelloWorld() {
        System.out.println("Hello World !");
    }

    @And("I say {string}")
    public void iSay(String arg0) {
        System.out.println(arg0);
    }

    @Given("I work with numbers")
    public void iWorkWithNumbers() {
        int i = 3;
        double d1 = 3.5;
        double d2 = d1 - 0.5;
        System.out.println(i == d2);

        Integer integer = 3;
        Double double1 = 3.5;
        Double double2 = double1 - 0.5;
        System.out.println(integer.equals(double2.intValue()));
        // (double2.intValue()) will be converted to int first, then it will compare it to integer

    }

    @Given("I work with maps")
    public void iWorkWithMaps() {
        Map<Integer, String> user1 = new HashMap<>();
        user1.put(0, "jdoe");
        user1.put(1, "password");
        user1.put(2, "jdoe@example.com");


        Map<String, String> user2 = new HashMap<>();
        user2.put("username", "jdoe");
        user2.put("password", "welcome");
        user2.put("email", "jdoe@example.com");
        user2.put("firstName", "John");
        user2.put("lastName", "Doe");

//        System.out.println(user1.get("username"));
//        System.out.println(user2.get("lastName"));
          System.out.println(user2);

        System.out.println();

        for (String key: user2.keySet()) {
            if (user2.get(key).equals("jdoe@example.com")) {
                System.out.println("Email found!");
            }
            System.out.println(user2.get(key) + " ");
        }


    }


    @And("I print url for {string} page")
    public void iPrintUrlForPage(String arg0) {
        if (arg0.equals("google")) {
            System.out.println("https://www.google.com");
        } else if (arg0.equals("quote")){
            System.out.println("https://skryabin.com/market/quote.html");
        } else {
            System.out.println("Not Found !");
        }
    }

    @And("I print if number {int} is positive")
    public void iPrintIfNumbreIsPositive(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative");
        } else {
            System.out.println("This is '0'");
        }

    }

    @And("I print {string} day of week")
    public void iPrintDayOfWeek(String weekDay) {
        String day = "";
        switch (weekDay) {
            case "1st":
                day = "Sunday";
                break;
            case "2nd":
                day = "Monday";
                break;
            case "3rd":
                day = "Tuesday";
                break;
            case "4th":
                day = "Wednesday";
                break;
            case "5th":
                day = "Thursday";
                break;
            case "6th":
                day = "Friday";
                break;
            case "7th":
                day = "Saturday";
                break;
            default:
                day = "Wrong day";
        }

        System.out.println(day);





//        HashMap <String, String> dayOfWeek = new HashMap<>();
//
//        dayOfWeek.put("1st", "Sunday");
//        dayOfWeek.put("2nd", "Monday");
//        dayOfWeek.put("3rd", "Tuesday");
//        dayOfWeek.put("4th", "Wednesday");
//        dayOfWeek.put("5th", "Thursday");
//        dayOfWeek.put("6th", "Friday");
//        dayOfWeek.put("7th", "Saturday");
//
//        if (dayOfWeek.containsKey(weekDay)) {
//            System.out.println(dayOfWeek.get(weekDay));
//
//        } else {
//            System.out.println("Wrong day number");
//        }
    }
}
