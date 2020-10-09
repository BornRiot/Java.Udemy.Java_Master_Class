/*
 * Write a method hasEqualsum with 3 parameters of type int.
 * The method should return boolean and it needs to return true
 * if the sum of the first number and the second number is equal to the third
 */


package code_blocks_methods_statements;

public class EqualSumChecker {
    public static boolean hasEqualSum2(int n1, int n2, int n3){
        return n1 + n2 == n3;

    }
    public static boolean hasEqualSum(int n1, int n2, int n3){
        if (n1 + n2 == n3){
            return true;

        } else

            return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(4,4,9));
        System.out.println(hasEqualSum2(4,4,9));


    }
}
