/***
 * Lecture covering float and double primitive data types in java
 */

package first_steps;

public class float_double_PrimTypes_28 {
    public static void main(String[] args){
        //Unlike whole numbers, floating point numbers
        // have fractional parts that are expressed with a decimal
        //We use floating point numbers when we need more precision in
        //a calculation
        //float is a single precision number
        //Precision refers to the format and the amount of occupied space by the type
        //Single precision occupies 32 bits and has a width
        // of 32 and double 64 with width of 64

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value =  " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

         int myIntValue = 5;
         float myFloatValue = 5.25f;
         //Java would assume this number above is a double if an F was not denoted at the end
         double myDoubleValue = 5.22; //It is good practice to denote data type values when declaring and initializing

        //The code below is used to solve the video challenge
        float testFloat = (float) 7.25; //solved the incompatible types error by putting a (float) after the =
        //float is generally not the preferred data type to use. Double is.
    }
}
