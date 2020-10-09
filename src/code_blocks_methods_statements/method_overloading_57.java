//package code_blocks_methods_statements;

/* Video discusses the topic of method overloading in java
 *
 */


public class method_overloading_57 {
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName+ " scored "+ score + " points" );
        return  score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Un-named Player scored "+ score + " points" );
        return  score * 1000;
    }

    public static int calculateScore(){
        System.out.println("no player name, no player score" );
        return 0;
    }
    public static void calculateScore(String playerName, int score, int blank){
        System.out.println("Player "+ playerName+ " scored "+ score + " points" );
    }




    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >= 0
    // You should validate that the 2nd parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // If the parameters are valid, then calculate how many centimetres
    // comprise the feet and inches passed to this method and return
    // that value.
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly.
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm  and one foot = 12 inches
    // use the link I give you to confirm your code is calculating correctly.
    // Calling another overloaded method just requires you to use the
    // right number of parameters.
    
    public static void main(String[] args) {
        calculateScore("Tim", 200);
        int new_score = calculateScore("Jess",300);
        System.out.println("New socre is "+new_score);
        calculateScore(50);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(0,5));
    }



    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //   Define variables to be used in method
        double centimeters = 0;
        double feetToCetni = 0;
        double inchesToCenti = 0;

        // Definse conditions to check for that should return -1 and abrupt program
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {

            // Calculate conversions for feet to centimeters and inches to centimeters
            feetToCetni = feet * 30.48;
            inchesToCenti = inches * 2.54;

            // Combine both conversions in one variable
            centimeters = feetToCetni + inchesToCenti;

            // return calculations
            return centimeters;
        }
    }


}
