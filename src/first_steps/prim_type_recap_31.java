/**
 * This program covers the recap of the primitive data types and also introduces the string data type
 * */
package first_steps;
public class prim_type_recap_31 {
    public static void main(String[] args){
        //int, double, and boolean are mostly used to calculate and build programs in java
        //The string in java is not a primitive data type but an actual class
        //a string is a sequence of characters. The string is limited by memory or the max value of int  data type.
        //that max value is 2.14 billion

        //define a string
        String myString = " This is a string";
        System.out.println("myString is equal to " + myString);

        //appending to myString using the + operator
        myString = myString + ", and this is more.";
        System.out.println(" myString is equal to" + myString );

        //using unicode in myString:
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString ="250.55";
        numberString = numberString +"49.95";
        System.out.println(numberString);
        //This does not compute the numbers in the string. We will learn hot to convert strings
        //to a numerical value at a later point in the course

    }

}
