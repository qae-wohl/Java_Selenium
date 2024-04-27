package support;

public class HomeWork2FromClassmates {
    private static String[] weekdaysModified = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main (String[] args) {
//        String[] names = {"Bob", "Eva", "Кага", "Мах", "Boris", "Larisa"};
//        int[] theIDs = {111, 22, 33333, 4, 55, 666};
//        Boolean[] mariedStatus = {true, false, true, true, false, false};
//
//        String[] days0fTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int[] ages = {59, 78, 49, 70};
        String[] name = {"Nancy", "Bernie", "Jenn", "Jordan"};
        boolean[] gender = {false, true, false, true};

        printArray(name, ages, gender);

    }

    public static void printArray(String[] name, int[] ages, boolean[] gender) {

        // table header
        System.out.println("Name\tAge\tSex");
        System.out.println();

        // Prints each line of a provided Array
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i] + "\t" + ages[i] + "\t" + (gender[i] ? "Male" : "Female"));
        }

        System.out.println();
    }


//        public static void printStringArray(String[] array) {
//            System.out. println ("Names:");
//            for (int i = 0; i < array. length; i++) {
//                System.out.println(array[i]);
//            }
//        }
//        public static void printIntegerArray(int[] array) {
//            System.out.println("IDs:");
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[i]);
//            }
//        }
//        public static void printBooleanArray(Boolean [] array) {
//            System.out.println("Married:");
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[i]);
//            }
//        }
//        public static void findFriday(String[] array) {
//            System.out.println("Days of the week - TGIF instead of Friday:");
//            String word = "";
//            for (int i = 0; i < array.length; i++) {
//                word = array[i];
//                {
//                    if (word == "Friday") {
//                        System.out.println("TGIF");
//                    } else {
//                        System.out.println(word);
//                    }
//                }
//            }
//
//            System.out.println();
//
//
//            for (String day : weekdaysModified) {
//                System.out.println(day);
//            }
//
//        }
}
