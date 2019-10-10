package first_steps;

public class Primitive_Types_24 {
    public static void main (String[] args){
        //In Java primitive types are the most basic data types. Int is one of the eight primitive types.
        //The eight primitive types are: boolean, byte, char, short, int, long, float, and double.
        //Consider these types as the building blocks pf data manipulation
        //Def: Package- A package is a way to organize your java projects. The are basically a subfolder of your
        //main project folder

        int myValue = 10000;
        int myMinIntValue =  Integer.MIN_VALUE;
        int myMaxIntValue =  Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        //Integer is known as a wrapper class. Def: Wrapper Class - Java uses the concept of wrapper class for all eight
        //primitive types which enables us to perform operations on the data types.
        //In this case, we are using Integer to let java tell us the minimum and maximum values that can be stored.

        System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); //This is known as an overflow
        //There us also an example of an underflow

        System.out.println("Busted Min Value = " + (myMinIntValue - 1)); //This is known as an under-flow

        int myMaxIntTest = 2_147_483_647; //Can be used to make numbers more readable

    }
}
