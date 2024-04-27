package support;

public class HomeAssignment1 {
    public static void main (String[] args) {
        System.out.println("Home Assignment 1");
        System.out.println();

        System.out.println("Print out String: ");
        String no1 = "Here's the String 1";
        String no2 = "Here's the String 2";
        System.out.println(no1);
        System.out.println();

        System.out.println("Print out an int");
        int simple = 18;
        System.out.println(simple);
        System.out.println();

        System.out.println("Print out a float");
        float decFl = 29.12F;
        System.out.println(decFl);
        System.out.println();

        System.out.println("Print out boolean");
        boolean anyValue = true;
        System.out.println(anyValue);
        System.out.println();

        System.out.println("Print out sum of two Strings");
        System.out.println(no1+"+"+no2);
        System.out.println();



        sum(5, 6);
        subtract(10, 12);
        multiply(3,5);
        divide(15,3);
        less_than(17,5);
        greater_than(10,4);
        equal_to(5,5);
        not_equal_to(1,3);


        System.out.println();



    }

    public static void sum(int x, int y) {
        System.out.println(x+y);
    }

    public static void subtract(int x, int y) {
        System.out.println(x-y);
    }

    public static void multiply(int x, int y) {
        System.out.println(x*y);
    }

    public static void divide(int x, int y) {
        System.out.println(x/y);
        System.out.println();

        System.out.println("Modulus:");
        System.out.println(9%4);
    }

    public static void less_than(int x, int y) {
        System.out.println("Print out results of all the Comparison Operators");
        System.out.println();
        System.out.println(x < y);
    }

    public static void greater_than(int x, int y) {
        System.out.println(x > y);
    }

    public static void equal_to(int x, int y) {
        System.out.println(x==y);
    }

    public static void not_equal_to(int x, int y) {
        System.out.println(x!=y);
    }


}
