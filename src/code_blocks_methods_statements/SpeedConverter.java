package code_blocks_methods_statements;

public class SpeedConverter {
    public static void main(String[] args) {
    	long getStuff = toMilesPerHour(1.5); 
    	System.out.println(getStuff);

    	printConversion(14.35);
        
    }

    public static long toMilesPerHour(double kilometersPerHour){
	long results = 0; 
	if(kilometersPerHour < 0 ){
		results = -1;

		return results; 
	} else if (kilometersPerHour > 1) {
		results = Math.round(kilometersPerHour / 1.609);
	}
		return results;

	}


	public static void printConversion(double kilometersPerHour){
		long milesPerHour = toMilesPerHour(kilometersPerHour); 

		if(milesPerHour < 0){
			System.out.println("Invalid Value"); 
		} else {
			System.out.println(kilometersPerHour + " km/h = "+ milesPerHour + " mi/h");
		}

	}

}
