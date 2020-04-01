package first_steps;
import first_steps.Operators_Operands_Expressions_32;

public class Abbreviating_Operators_33 {
    public static void main(String args[]){
        //teaches how to abbreviate operators
        //How to abbreviate result = result + 1;

        int result = 4 % 3;
        System.out.println("The answer to result is: "+result);
        result++; //the value if the operation would then be 2
        //This equation can be written as result = result + 1;
        System.out.println("the value of result would then be " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1  = " + result);

        //short hand method of adding 2 to result:
        //result = result + 2
        result += 2;
        System.out.println("The value of result would then be: 1 + 2 = " + result);

        //short hand version of multiplication
        //result = result * 10  = 30
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3 = 10
        result /= 3;
        System.out.println("30 / 3 = " +  result);

        //result =  result - 2 = 8
        //shorthand abbreviation of equation above is:
        result -= 2; //10 - 2  = 8
        System.out.println("10 - 2 = " + result);



    }
}
