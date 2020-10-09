package code_blocks_methods_statements;

public class SecondsMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int seconds){
//      If invalid values are entered return an error message
        if ((minutes < 0) || ( seconds < 0)|| (seconds > 59)){
            return "Invalid Values";
        }
        else
            {
            // If values are correct, convert values to correct hours, minutes and seconds
//            Parse Integer values to a string
            int hours = minutes / 60;
            int remMinutes = minutes % 60;
            int remSeconds =  seconds % 60;
            String new_h;
            String new_m;
            String new_s;
//                Bonus challenge: Add preceding 0's
                if (hours < 10){
                    new_h =  "0" +hours + "h";
                }
                else {
                    new_h = hours + "h";
                }
                if (remMinutes < 10){
                     new_m =  "0" +remMinutes + "s";
                }
                else {
                    new_m = remMinutes + "s";
                }
                if (remSeconds< 10){
                     new_s =  "0" +remSeconds + "s";
                }
                else {
                    new_s = remSeconds + "s";
                }
                return new_h+" "+new_m+ " "+ new_s; //Instead of using Integer.parseInt, concatenate
//                integer to string using +
        }
    }
    public static String getDurationString (int seconds ){
        if (seconds < 0 ){
            return "Invalid value entered ";
        }
        else {
           int  the_minutes =  seconds / 60;
           int the_rem_seconds =  seconds % 60;
           return getDurationString(the_minutes, the_rem_seconds);
//            returned the previous method instead of creating a new var to hold it
        }
    }


}
