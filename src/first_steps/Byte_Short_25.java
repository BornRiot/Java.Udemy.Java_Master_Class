/**
 *This is used to demonstrate the examples listed in video 25 of the first steps section of the course. 
 *
 */
package first_steps;
public class Byte_Short_25 {
    public static void main(String args[]){
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        //Use the byte data type if you are trying to conserve memory
        System.out.println();


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println();

        /*
            A byte occupies  8 bit 
            A short occupies 16 bits 
            An Integer occupies 32 bits 
         */
        
        //Intro of the long data type
        long myLongValue = 100L;
        //The long value has a width of 64
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        



    }
}
