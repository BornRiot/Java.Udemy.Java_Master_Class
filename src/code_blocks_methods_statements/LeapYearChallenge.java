/*
  This program is used to solve the LeapYear coding challenge
 */

package code_blocks_methods_statements;

public class LeapYearChallenge {
    public static void main(String[] args) {
        System.out.println(isLeapYear(10000));

    }

    public static boolean isLeapYear(int year ) {
        if(year < 1 || year > 9999){
            return false;
        }
          else if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    } }
