package pythontojava;

import java.util.Arrays;
import java.util.Scanner;
public class test_loops {
    public static void main(String[] args) {
        Scanner theInput = new Scanner(System.in);
        //String which we want to convert to String array


        String str = "This is a line. take it and make something";
        str.split("");
        for (int x = 0; x < str.length(); x++){
            System.out.println(str.charAt(x));
        }
        /*
         * To convert String object to String array, first thing
         * we need to consider is to how we want to create array.
         *
         * In this example, array will be created by words contained
         * in the original String object. So, first element of array
         * will contain "java", second will contain "String" and so on.
         *
         * To convert String to String array, use
         * String[] split(String delimiter) method of Java String
         * class as given below.
         */

        String[] strArray = str.split("");

        System.out.println("String converted to String array");

//        //print elements of String array
//        for (String s : strArray) {
//            System.out.println(s);
//        }

    }

}






