/**
 * This code corresponds to the video lecture 38 and is used to complete the challenge in the video
 * */
package first_steps;

public class OperatorPrecedenceChallenge_39 {
    public static void main(String[] args){
        double theDoubleV = 20.0; //Created a double variable with a value of 20
        double theDoubleV2 = 80.0; //Created a double variable with a value of 80
        double numsTogether = (theDoubleV + theDoubleV2) * 100; //Added  both numbers and multiplied by 100
        double theRemnants = numsTogether % 40; //assigned the results of the remainder operation to variable
        boolean checkRemainder = (theRemnants == 0) ? true:false; //Create a boolean variable that assigns true or false
        System.out.println(checkRemainder); //Output the boolean variable
        if (!checkRemainder ){//Write if - then statement that outputs git some remainder
            System.out.println("Got some remainder");
        }


}
}
