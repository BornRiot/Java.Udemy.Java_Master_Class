/***
 * This program covers the topics of char and boolean primitive types in java
 */

package first_steps;
public class char_and_booleanPrimTypes_30 {
    public static void main(String[] args){
        char myChar = 'D';
        //char is similar to strings in that it can store a character but it can only store 1 character
        //char is also useful for storing data in arrays
        //char occupies 2 bytes of memory or 16 bits and has a width of 16
        //It allows us to store unicode characters
        //Unicode is an international encoding standard for use with different languages
        //and scripts by which each letter, digit, or symbol is assigned a unique numeric value
        //that applies across different platforms
        //you can use  unicode in java to display char data types in java:
        //see slides fir mire info on unicode
        char myUnicodeChar = '\u0044';
        System.out.println(myUnicodeChar);
        System.out.println(myChar);
        //display the copy right symbol using unicode:
        char copyRight = '\u00A9';
        System.out.println(copyRight);

        //Introduction to the boolean values:
        boolean myTrueBooleanValue = true;
        boolean  myFalseBooleanValue = false;
        boolean isO21 = true;

    }
}
