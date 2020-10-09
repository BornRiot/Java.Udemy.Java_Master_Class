// This is the correct code to accomplish the task
/* Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
 * The method  should return type boolean and needs to return true if two double numbers
 * are the same up to 3 decimal places.
 */


package code_blocks_methods_statements;
public class DecimalComparator_OS {
    static boolean areEqualByThreeDecimalPlaces(double first_num, double sec_num){
        first_num =  first_num * 1000;
        sec_num = sec_num * 1000;
        int n1 = (int)first_num;
        int n2 = (int)sec_num;
        return n1 ==  n2;
    }
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(4.545, 4.5455));
    }
}










