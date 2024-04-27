package definitions;

import io.cucumber.java.en.Given;
import org.junit.Test;

import java.util.Arrays;

public class JavaProblemStepsDef {

    @Given("I solve Java Challenge") @Test
    public void iSolveJavaChallenge() {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2 + 1;
        }
        System.out.println("arr = " + Arrays.toString(arr));
        
//        solution(arr);
        System.out.println(calculator(3,5,"+"));
    }



    // Calculator

    private int calculator(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a/b;

//                if (b == 0) {
//                    throw new ArithmeticException("Division by zero");
//                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }

//    private void solution(int[] a) {
//        for (int i = a.length - 1; i >= 0 ; i--) {
//            System.out.println("a[i] = " + a[i]);
//        }
//    }


    }
}
