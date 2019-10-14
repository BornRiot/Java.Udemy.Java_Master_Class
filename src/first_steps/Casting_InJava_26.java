/**
 * This class is used to cover the topic of casting and the corresponding lecture video.
 * Created: 10/12/19
* */
package first_steps;

public class Casting_InJava_26 {
    public static void main (String[] args){
        Primitive_Types_24 thisType = new Primitive_Types_24();
        int myTotal  = (thisType.myMinIntValue/2);
        Byte_Short_25 newByteVal = new Byte_Short_25();
        //byte myNewByteValue = (newByteVal.myMinByteValue/2); This produces an error related to casting, the default
        //whole number is an int which produces an error. The equation would still result in a number that fits
        //Casting means to convert a number from one type to another. We put the type we want the number to be in
        //parenthesis: (byte)(myMinByteValue/2);

        byte myNewByteValue = (byte)(newByteVal.myMinByteValue/2);
        System.out.println(myNewByteValue);
        //The same principle applies for short numbers


    }
}
