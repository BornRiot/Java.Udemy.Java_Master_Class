package control_flow_statements;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(getDaysInMonth(4,-2017));
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
    }
    public static int getDaysInMonth(int month, int year){
        int[] months_with31 = {1,3,5,7,8,10,12};
        int[] months_with30 = {4,6,9,11};
        boolean monthIs30 = false;
        boolean monthIs31 = false;
        for (int n: months_with31){
            if(month == n){
                monthIs31 = true;
                break;
            }
        }
        for (int n: months_with30){
            if(month == n){
                monthIs30 = true;
                break;
            }
        }
        int numberOfDays = 0;
        if ((month < 1 || month > 12) || (year < 1 || year  > 9999) ){
            numberOfDays = - 1;
        }
        else if (isLeapYear(year) && month == 2){
            numberOfDays = 29;
        } else if (!isLeapYear(year) && month == 2){
            numberOfDays = 28;
        }
        else if (monthIs31){
            numberOfDays  = 31;
        }
        else if (monthIs30){
            numberOfDays = 30;
        }
        return numberOfDays;
    }
}
