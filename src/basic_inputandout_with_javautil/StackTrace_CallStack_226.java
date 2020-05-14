/**
This lecture covers the topic of stack traces and call stack and looks at
how java produces a call stack and how the programmer should interpret them
in prder to solve for the errors that caused them.


*/
package basic_inputandout_with_javautil;

//Def: Exception- An event which occurs during the execution of a program which
//disrupts the normal flow of a program

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace_CallStack_226 {

    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) { //It is best to code for specific exceptions
                                            //instead of using general catch all exceptions
                                            //such as "Exception e. #Note: to let the calling mehtod know there was a problem
                                            //the code could have thrown the exception to leth the program know there was a problem  " 
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
