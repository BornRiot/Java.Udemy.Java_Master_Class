/*  Write a method named hasTeen with 3 parameters of type int
 *  The method should return boolean and it needs to return true
 *  if one of the parameters is in the range 13-19 inclusive
 */

package code_blocks_methods_statements;
import java.util.Arrays;
public class TeenNumberChecker {
    public static boolean  checkArray(int[] arr, int the_val){
        Arrays.sort(arr);

        int the_result = Arrays.binarySearch(arr, the_val);

        boolean the_info = the_result > 0 ? true : false;

        return the_info;

    }
    public static boolean hasTeenA(int n1, int n2, int n3){
        int the_teens[] = {13,14,15,16,17,18,19};
        boolean result = false;
        boolean first = checkArray(the_teens,n1);
        boolean second = checkArray(the_teens, n2);
        boolean third = checkArray(the_teens, n3);
        if (first == true){
            result = true;
        }
        else if (second == true){
            result = true;
        }
        else if (third == true){
            result = true;
        }
        else result = false;

            return result;
    }

    public static boolean hasTeen(int n1,int n2, int n3) {
        int the_teens[] = {13,14,15,16,17,18,19};
        boolean res = false;
        for (int i: the_teens) {
            if (i == n1 | i == n2 | i == n3) {
                res =  true;
            }
        }
         return res;
        }

    public static boolean isTeen(int n1){
        int []the_teens ={13,14,15,16,17,18,19};

        for (int i: the_teens){
            if (i == n1){
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
//        System.out.println(hasTeenA(36,17,36));
 // System.out.println(hasTeen2(14,54,96));
        System.out.println(hasTeen(21,11,13));



    }
}
