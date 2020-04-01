/**
 *This is used to demonstrate the examples listed in video 25 of the first steps section of the course. 
 *
 */
package first_steps;
public class Byte_Short_25 {



    public static void main(String args[]){
   byte myMinByteValue = Byte.MIN_VALUE;
   byte myMaxByteValue = Byte.MAX_VALUE;
        int myMaxIntTest = 2_147_483_647;


        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        //Use the byte data type if you are trying to conserve memory
        //Use the byte through using code documentation to let other programmers know you are conserving memory
        System.out.println();
        //There is a search and replace function in IntelliJ the lets you find and replace words
        //located in the edit menu then find and replace


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println();

        /*
            A byte occupies  8 bit and therefore has a width of 8
            A short occupies 16 bits and width of 16
            An Integer occupies 32 bits 
         */
        
        //Intro of the long data type
        long myLongValue = 100L;
        //The long value has a width of 64
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;  //By not putting the L at the end of the number, it results in a
        // syntax error for the incorrect data type
        System.out.println("Print out of bigLongLiteralVal "+bigLongLiteralValue);
        //Java has the ability to autodetect number ranges that are too large for a data type
        //Each primitive  data type in Java has a specific size and width
        //See lecture slides "More Primitive Types" for info about the size of Byte, Shorts and Longs. section jm-7-2


        



    }
}
