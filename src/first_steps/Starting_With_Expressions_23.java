/*
*Video continues from the variables lecture with re implementing previous variables such as myFirstNumber
* Lecture defines and demonstrates the use of expressions
* */
package first_steps;

public class Starting_With_Expressions_23 {
    public static void main(String[] args){
/*
         * "Starting Out With Expressions"
         * Video begins w/ a challenge
         * first: 12 int mySec
         * sec : 6 int myThird
         * */
        System.out.println("Hello, Tim");
        int myFirstNumber = (10 + 5) + (10 * 2);
        //Expressions are a construct that evaluates to a single value
        System.out.println(myFirstNumber);
        //Def: String literal- Any sequence of characters surrounded by double quotes. The values of string literals cannot
        // be changed

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
        System.out.println("The value of the variable myLastOne is: "+myLastOne);

    }
}
