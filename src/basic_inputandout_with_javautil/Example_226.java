package basic_inputandout_with_javautil;
/**
  This code is a continuation of lecutre StackTrace_CallStack_226

*/
import java.util.Scanner;

/**
 * Created by timbuchalka on 1/04/2016.
 */
public class Example_226 {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {   //Two exceptions that can occur: divide by zero and InputMismatchException
                                    //Note: when looking at stack traces, its best to start at the bottom of the trace to
                                    //Identify errors specifically related to your code
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        return s.nextInt();
    }
}
