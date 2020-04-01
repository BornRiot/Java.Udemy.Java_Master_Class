/***
 * Lecture 32 in first steps covers operators , operands and expressions
 */

package first_steps;

public class Operators_Operands_Expressions_32 {
    private static int result;


    public static void main(String args[]){
        //Operator= symbols in java that perform mathematical calculations

        //Operand- the object which is manipulated by the operator in mathematical equations for java. variables c
        // an also be operands
       int theEquation = /*----> the 5 and 3 are the operands in this equation */5 * 23;
       //example of an operand: int myVar = 15 + 12. The + is the operator and the 15 and 12 are the operands
       //Def: Expression- is formed by combining variables, literals, method return values and operators.
       //Example of an expression:


         result = 1+2; //1+2 =3
        //equal operator is an assignment operator
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1;  // 3 -1 = 2
        System.out.println("3 - 1 =  " + result);
        //After running 3 - 1 = 2, previous result remains the same value
        System.out.println("previousResult = " + previousResult);

        result = result * 10;  //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 ÷ 5 = 4
        System.out.println("20 / 5 = " + result);

        //using the modulo operator to get the remainder of an equation

        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println("(4 % 3) = " + result);


    }
}
