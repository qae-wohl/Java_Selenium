package support;

public class Java4Life {

    public static void main (String[] args) {
        System.out.println("Hello World");

        System.out.println(7%2);

        sum(5, 6);
        subtract(10, 12);
        multiply(3,5);
        divide(9,3);
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
    }

}
