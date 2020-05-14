/**
 * This program covers the topic of assignment VS Equal Operators. This class corresponds to video lecture 37.
 * */
package first_steps;

public class AssignmentVSEqualOperators_37 {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;  // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result +2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;  // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        //The code for lecture 37 begins below this line of comment

        //In the video, the line of code is first written as
        //int newValue = 50
        //if (newValue = 50)  {
        // System.out.println("This is an error") This produces an error of incompatible types in the video.
        // The code uses the = assignment
        //operator and not the comparison equal assignment operator which in effect produces the error.
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        //The line below represents the original isCar expression that is used in the video
        boolean isCar1 = false;
        if(isCar1 == true){
            System.out.println("this is not suppose to happen ");
            //Video poses the question of what will happen if code is executed.
            //Answer: It printed out the statement because the isCar variable is of type boolean and can then be
            // reassigned the value of true from false in line 85 and therefore print the statement specified
            // I reassigned the = operator in the above expression to == so that the below expression would work

        }
        //the proper way of writing the previous block of code:
        if(isCar1 == true){
            System.out.println("This will never happen ");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
        //The above expression uses the NOT operator also known as the Logical Compliment Operator,
        //Video states the by adding the ! operator before the value we can check the opposite. Which is false in this case
        //The code below is used to test the NOT equal to operator
        boolean isHot = false;
        if(!isHot){ //Test if the value is not true.
            System.out.println("It is hot");
        }

        boolean isFat = false;
        if(!isFat){
            System.out.println("You are not fat");
        }

    }


}
