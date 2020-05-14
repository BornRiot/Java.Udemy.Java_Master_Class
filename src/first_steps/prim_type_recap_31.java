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
        //You can combine data types such as ints and doubles  to create your own super  data which are also known as
        // classes

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
        //This does not compute the numbers in the string. We will learn how to convert strings
        //to a numerical value at a later point in the course

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to: " + lastString);

        //Java has converted the in the previous line to a string and appended it to the line
        //adding a new number to  the previous last  string value:
        double doubleNumber = 120.47D;
        lastString =  lastString + doubleNumber ;
        System.out.println("LastString is equal to " + lastString);
        //You can change the characters in a string by creating a new string and appending it to the old one.
        //Strings in java  are immutable
        //With the assignment of the double value to lastString, the old value of the variable is discarded and a new
        // value is assigned
        //Using these methods covered above is not an accurate way of editing strings.
        //It would be best suited to use what is known as StringBuffer which will be covered in a later lecture of course
        //Strings in java are treated like a primitive type but are actually a class







    }

}
