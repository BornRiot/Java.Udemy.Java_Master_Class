//The porpose of this lesson is using two useful methods to try to catch errors either before they are made or after
//Program uses two concepts popular in java and perhaps other languages known as LBYL and EAFP
//The shorthand "ON"'s in this document stands for organize note when going over the code

package basic_inputandout_with_javautil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_225{

    //Two main ways of dealing with errors
    // LBYL: Look before you leap and  EAFP: easy to ask for forgivenss and permisiion two ways of dealing with exception
    // handling



    public static void main(String[] args) {
        //These numbers below are used to try the EAFP and LBYL methodology
        //Research more on each of these methods
        //Will be commented out after use
        System.out.println();
         int x = 98;
         int y = 0; //Using divide by zero and divide mehtod will cause the program to ultimately crash and produce an
        // exception error
     System.out.println(divideLBYL(x, y));     //Both functions can cope with an attempt to divide by 0. Method outputs 0
      System.out.println(divideEAFP(x, y));     //Both functions can cope with an attempt to divide by 0. Method outputs 0
//      System.out.println(divide(x, y)); //Use of method to show program will crash
        int x2 = getInt(); //The creation of this line of code is used to test all  the methods used. LBYL/EAFP
        System.out.println("x2 is: " + x2
        );


       // int x = getIntEAFP();
        System.out.println("x is " + x);
        //The code below is used to demonstrate the results of x2 = getInt();
        System.out.println("X2 = " + x2);
        //The results of the code when using text is a InputMismatchException

        //Both the LYBL and EAFP methods for catching exception are good based on what you are using them for
        //organize note

        }


    //Method used to out results of x2 = getInt();
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();

        //You get an input mismatch exception when enterin text instead of numbers
        //ON
    }


    private static int getIntLBYL() { //For this program, using this method to catch exceptions reqquires more code
        //compares to using the EAFP mehtod demonstrated below.
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) { //Line uses a call to the character class and invokes the
                //isDigit Function
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() { //This is a shorter version of catching error exceptions compared to LBYL
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();  // Any code inside the try block gets executed
        } catch(InputMismatchException e) { //If there is any error the code will then come this block and
          //return the errors
            return 0;
        }
    }

    //This is look before you leap
    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    //EAFP methodology
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;  //not doing any testing to see if the
            //results are correct
        } catch(ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) { //This method is used to prve that the program will crash
        return x / y;
    }
}
