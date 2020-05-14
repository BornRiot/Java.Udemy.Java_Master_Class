package code_blocks_methods_statements;
public class BarkingDog{
	public static void main(String[] args) {
		boolean theResult = shouldWakeUp(true, 4);
		System.out.println(theResult);
	}
	public static boolean shouldWakeUp(boolean barking, int hourOfDay){
		boolean wakeUp = false;
		barking = false;
		if  ( hourOfDay >= 0 || hourOfDay <= 7){  //Sleeping after midnight
			 if (barking == true){
				wakeUp = true;
			} else if (!barking){
				wakeUp = false;
			}
		}
		else if (hourOfDay >= 22 || hourOfDay <= 23){ //Sleeping before midnight
			if (barking){
				wakeUp = true;
			}
		}
		else  if  (hourOfDay >=  8  || hourOfDay <= 21) { //Awake during the day
			if (barking){ wakeUp = false;
		}}
		else if (!barking){  //Not barking at all
			wakeUp = false;
		}

		return wakeUp;}

}