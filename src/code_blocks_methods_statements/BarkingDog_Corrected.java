/*This is the correct code for the BarkingDog program. My original code was not
 *  returning the desired results when inputting certain data the
 * Correct Answer provided by Trevor from class
 * The code can also be further simplified using IDE tools
 * Program also contains a shortened version of  the shouldWakeUp method
 *
 */

//With going over this code, the main take away I have gathered is the need to perfect brevity in my coding.
//through analyzing the correct answers for the challenge. The solutions which I tried to Implement were a lot
// longer than they needed to be and often did not produce the correct results
package code_blocks_methods_statements;
public class BarkingDog_Corrected {
    public static void main(String[] args) {
       boolean theResult = shouldWakeUp(false, 2);
        System.out.println(theResult);
        boolean theResult2 = shouldWakeUp_Shotened(true, 8);
        System.out.println(theResult2);

}
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        //boolean wakeUp = false;
        // barking = false;
        if (hourOfDay < 0 || hourOfDay >23){
            return false;
        }
        return barking == true && hourOfDay < 8 || barking == true && hourOfDay > 22;

        //Sleeping after midnight
//            if (barking = true){
//                wakeUp = true;
//            }


//            else if (!barking){
//                wakeUp = false;
//            }
//        }
//        else if (hourOfDay >= 22 && hourOfDay <= 23){ //Sleeping before midnight
//            if (barking){
//                wakeUp = true;
//            }
//        }
//        else  if  (hourOfDay >=  8  && hourOfDay <= 21) { //Awake during the day
//            if (barking){ wakeUp = false;
//            }}
//        else if (!barking){  //Not barking at all
//            wakeUp = false;
//        }


}

    public static boolean shouldWakeUp_Shotened(boolean barking, int hourOfDay){
        //boolean wakeUp = false;
        // barking = false;
        if (hourOfDay < 0 || hourOfDay >23){
            return false;
        }
        return barking && hourOfDay < 8 || barking && hourOfDay > 22;



    }


}
