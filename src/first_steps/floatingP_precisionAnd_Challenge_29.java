/**
 *
 * */
package first_steps;

public class floatingP_precisionAnd_Challenge_29 {
    public static void main(String[] args){
        //Continuation from last videos with using previous variables
        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //The proceeding lines of code denotes what happens when you
        //divide the numbers

        System.out.println("This separates us");
        myIntValue /= 2;
        myFloatValue /= 2f;
        myDoubleValue /= 2d;


        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        System.out.println("This separates us");
        myIntValue =5/ 3;
        myFloatValue = 5f/3f;
        myDoubleValue = 5d/3d;


        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
        //Double values are faster to process on today's computers
        //Most java math functions are written to process double numbers
        //not floats

        /*Video challenge: Convert a given number of pounds to kilograms */
        double thePounds = 23;
        double theKilos = thePounds * .45359237;
        System.out.println("Converted kilograms = " + theKilos);

        //Using the amount of 200 for thePounds as in the video
         thePounds = 200d;
         theKilos = thePounds * .45359237;
        System.out.println("Converted kilograms = " + theKilos);

        //Printing iut double numbers using underscores
        double Pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(Pi);
        System.out.println(anotherNumber);

        //For precise calculations, it is best not to use float or double
        //data type numbers but BigDecimal instead
        //BigDecimal will be covered in more details later on in the course
    }
    }


