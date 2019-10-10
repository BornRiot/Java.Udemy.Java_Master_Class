package first_steps;

public class Starting_With_Expressions_23 {
    public static void main(String[] args){



        /*
         * "Starting Out With Expressions"
         * Video begins w/ a challenge
         * first: 12 int mySec
         * sec : 6 int myThird
         * */

        int myFirstNumber = 8;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        //Second myTotal Demo In vid
        myThirdNumber = myFirstNumber*2;
        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        //Third Challenge
        //myLastOne should be 1000 less than myTotal
        int myLastOne = 1000  -  myTotal;
        System.out.println(myLastOne);

    }
}
