package support;

public class JavaIsKew {
    public static void main (String[] args) {
        int num = 20;
        int moon = 1;
//        daClub(num);
        printLetters();


        int[] ages = {22,18,21,23};
        String[] names = {"Alice","Bernie","Joseph","Thomas"};
        boolean[] single = {true,false,true,true};

//        System.out.println(ages[2]);
//        System.out.println(names[1]);

        int headCount = 12;
//        printInts (headCount);

        // Print table header
        System.out.println("Name\tAge\tSingle");

        // Print data rows in regular order
        for (int i = 0; i < ages.length; i++) {
            String singleStatus = single[i] ? "yes" : "no";
            if (i == 2) {
                System.out.println(names[i] + "\t" + ages[i] + "\t" + singleStatus);
            }
        }
        System.out.println();
        // Print data rows in reverse order
        for (int i = ages.length - 1; i >= 0; i--) {
            String singleStatus = single[i] ? "yes" : "no";
            System.out.println(names[i] + "\t" + ages[i] + "\t" + singleStatus);
        }


    }

    public static void printLetters() {

        String word = "Congratulations!";

        // Print each character separately
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            System.out.println(character);
        }
    }


//    public static void printInts(int target) {
//        for (int i = 0; i <= target; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i+" IS MY FAVORITE NUMBER!");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//    }

//   public static void printInts(int[] ages) {
//            for (int i = 0; i <= ages; i++) {
//                if (i == 5) {
//                    System.out.println("MY FAVORITE NUMBER!");
//                } else {
//                    System.out.println(i);
//                }
//            }


//    public static void guessNumber(int guess) {
//        int n = 1;
//        while (n != guess) {
//            System.out.println("Try again");
//        }
    }

//    public static void daClub(int age) {
//        if(age >=21) {
//            System.out.println("Welcome to DaClub!!!!");
//        } else if(age < 21 && age >= 18){
//            System.out.println("No Drinking or Drugs!");
//        } else {
//            System.out.println("Get out scrub!");
//        }

//    public static void daClub(int age) {
//        if(age >= 21) {
//            System.out.println("Welcome to DaClub~!!!!");
//        } else if(age < 21 && age >= 18){
//            System.out.println("NO DRINKING OR DRUGS!!!");
//        } else {
//            System.out.println("Get out scrub!");
//        }
//    }


//    public static void guessNumber(int guess) {
//        int n = 1;
//        while (n != guess) {
//            System.out.println(n);
//            System.out.println("WRONG NUMBER");
//            n++;
//        }
//    }


//    public static void printInts(int target) {
//        for (int i = 0; i <= target; i++) {
//            if (i == 5) {
//                System.out.println("MY FAVORITE NUMBER!");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }


//    public static void printAge(int[] ages) {
//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//        }
//    }

//    public static void dayWeeks(int d){
//        String day = "";
//        switch (d) {
//            case 1:
//                day = "Monday";
//                break;
//            case 2:
//                day = "Tuesday";
//                break;
//            case 3:
//                day = "Wednesday";
//                break;
//            default:
//                day = "Invalid day";
//        }
//        System.out.println(day);
//    }

//
//
//    }



