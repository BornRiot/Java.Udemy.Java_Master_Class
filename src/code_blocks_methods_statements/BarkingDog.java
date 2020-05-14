package code_blocks_methods_statements;

public class BarkingDog{

    public static void main(String[] args) {
        shouldWakeUp(true,14);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        //boolean wakeUp = false;
        // barking = false;
        if (hourOfDay < 0 || hourOfDay >23){
            return false;
        }
        return barking && hourOfDay < 8 || barking && hourOfDay > 22;

    }}