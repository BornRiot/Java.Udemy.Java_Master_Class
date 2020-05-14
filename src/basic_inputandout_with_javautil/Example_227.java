package basic_inputandout_with_javautil;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by timbuchalka on 1/04/2016.
 */
public class Example_227 {

    public static void main(String[] args) {
        int result = divide(); //Implementation of 'divide' method
        System.out.println(result); //Displays results of the divide method.


    }

    private static int divide() {  // Creation of the 'divide' method
        int x, y; // declare variables outside the try block in order to use the variables
        try {
            x = getInt();
            y = getInt();
        } catch(NoSuchElementException e)
        {
            throw new ArithmeticException("no suitable input");
        }
        System.out.println("x is " + x + ", y is " + y);
        try {
            return x / y;
        } catch(ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero"); //Using the throw new exceptionallows you to go directly
            //to the line in   your code that produces the error. Makes understanding the stack trace a lot simpler
        }
    }

    private static int getInt() { //It is against good programing practice to use a method like this while coding
      //More suitable ways will be shown later in the course
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer "); //Catching the NoSuchElementException is not useful if there is still more i
        // input available. Its best to allow the exception to propagate to the calling method.   but
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {// Try to keep exception codes simple to avoid other  possible
              //exceptions. Nesting exceptions may be necessary but should not be used frequently
                // go round again.  Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }
        }
    }
}
