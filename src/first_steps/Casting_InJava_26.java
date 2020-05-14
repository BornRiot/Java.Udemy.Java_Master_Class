/**
 * This class is used to cover the topic of casting and the corresponding lecture video.
 * Created: 10/12/19
* */
package first_steps;

public class Casting_InJava_26 {
    public static void main (String[] args){
       //Defined variable myMinIntValue to be used in program
        int myMinIntValue = Integer.MIN_VALUE;
        int myTotal  = (myMinIntValue/2);

        //Define myMinByteValue to be used in program
        byte myMinByteValue = Byte.MIN_VALUE;
       // byte myNewByteValue = (myMinByteValue/2);
        //Using byte myNewByteValue = (myMinByteValue/2) produces a syntax error in the program due to storing an int
        //into a byte value. The correct procedure to correct the error is by using casting:
        byte myNewByteValue = (byte)(myMinByteValue/2);

        //byte myNewByteValue = (newByteVal.myMinByteValue/2); This produces an error related to casting, the default
        //whole number is an int which produces an error. The equation would still result in a number that fits
        //Casting means to convert a number from one type to another. We put the type we want the number to be in
        //parenthesis: (byte)(myMinByteValue/2);

        //The same concept applies ti the use of short data types as follows:
        short myMinShortValue = Short.MIN_VALUE;
        short myNewShortValue = (short)myMinShortValue;
        System.out.println(myNewShortValue);


        System.out.println(myNewByteValue);
        //The same principle applies for short numbers


    }
}
