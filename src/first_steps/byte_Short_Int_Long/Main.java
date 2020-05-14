package first_steps.byte_Short_Int_Long;

public class Main {
    public static void main(String[] args) {
        int  myValue = 10000;
        //How to determine the range of a primitive type
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        //Java uses the concept of wrapper class for all 8 primitive types.
        //By using Integer, we can have different ways to perform operations on  an int.
        //Def: Wrapper Class- A Wrapper class is a class whose object wraps or contains a primitive data types.
        //Using a busted Max Value for myMaxIntValue
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); //Doing this will result in an overflow.
        //it means that after incrementing 1 on Integer.MAX_VALUE (2147483647), the returned value will be -2147483648.
        //The same occurs for the min value:
        System.out.println("Busted Min value = " + (myMinIntValue - 1)); //This concept is known as underflow
        //You can use underscores in the typing of large numbers to enable better readability:
        int myMaxIntTest = 2_147_483_647;
        System.out.println("This was done 09/28/19");
        //The next video lesson "byte, short, int and width" is done in the program corresponding to the same name in the first_steps folder




    }
}
