package challenges;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Challenges {

    public static void main(String[] args) {
//      // print array elements using standard loop
//        int[] arr1 = {3, 5, 1, 7, 0, 8};
//        printArray(arr1);
//        System.out.println();
        String[] array = {};
        reverseArray();
//        evenNumbers();
//        everySecond();
        System.out.println("Result is: " + ifArrayIsEmpty(array));
//        iSolveProblem();

    }

//    static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    // Initiate re-used array
    public static int[] arr2 = {3, 5, 1, 4, 3, 2, 8, 9};

    // 1) Print elements of an array in reverse order
    public static void reverseArray() {
        System.out.println("Elements of an array in reverse");
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    // 2) Print every second element of an array
    @Test
    public void everySecond() {
        System.out.println("Every second element is: ");
        for (int i = 1; i < arr2.length; i = i + 2) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    // 3) Print all even elements of an array
    @Test
    public void evenNumbers() {
        System.out.println("All even elements are: ");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();

    }

    static boolean ifArrayIsEmpty(String[] array){
        return array.length == 0;
    }

    
}

//    public static void ifArrayIsEmpty () {
//        Integer[] arr1 = {};
//        if (arr1.length==0) {
//                System.out.println("Array is empty");
//            } else {
//                System.out.println("Array is not empty");
//            }
//        }
//    }












//     public static void iSolveProblem() {
//         int[] arr = new int[] {1,5, 11, 3, 7, 0, -4};
//         System.out.println("arr = " + Arrays.toString(arr));
//
//
//         System.out.println();
//
//
////          1. Calculate the sum
//         int sum = 0;
//         for (int i = 0; i < arr.length; i ++) {
//            sum += arr[i];
//         }
//         System.out.println("sum =" + sum);
//
////          2. get the amount of elements
//        int length = arr.length;
//
////         3. get the average
//        double avg = (double) sum / length;
//         System.out.println(avg);
//    }



