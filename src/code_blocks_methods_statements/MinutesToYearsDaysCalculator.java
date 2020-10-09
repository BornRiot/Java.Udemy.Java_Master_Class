package code_blocks_methods_statements;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(260547);

    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long years = (minutes/60/24/365);
            long days = ((minutes % 525600)/60/24);
            System.out.println(minutes +" minute(s) = "+years+" year(s) and "+ days + " day(s)");

        }
    }
}
