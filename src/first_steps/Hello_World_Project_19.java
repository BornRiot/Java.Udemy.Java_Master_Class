package first_steps;

public class Hello_World_Project_19 {
    /*Write java programs following  a specific set of rules, using a combination of keywords and other resources
     you'll see which will collectively form a java program.
    **/
    //keywords in java are case sensitive
    //Access modifiers are used to define the access restrictions to classes in java
    //left and right curly braces are used to define the class body/block.


    public static void main(String[] args)  {
        System.out.println("Hello World"); //Def: Statement- A complete command to be executed and can include one
        // or more
        // expressions





         int myFirstNumber = 5; // It is common practice to cap the sec and every oth word in java variables
         //Challenge: print out the value of myFirstNumber on the screen
        System.out.println("The line below this statement is used to complete the challenge");
        //Variables in java have to be initialized before they are used
        System.out.println(myFirstNumber);
        //You can add even more complex expression to the right of the equal sign
        myFirstNumber = 11 + 7;
        System.out.println(myFirstNumber);
         //even more complex
        myFirstNumber = (10 + 5) + (10 * 2);
        //Expressions are a construct that evaluates to a single value
        System.out.println(myFirstNumber);
        //Def: String literal- Any sequence of characters surrounded by double quotes

        /*
        * "Starting Out With Expressions"
        * Video begins w/ a challenge
        * first: 12 int mySec
        * sec : 6 int myThird
        * */

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
        /*
        * "Primitive Types"
        * There are 8 primitive data types in java: boolean,byte, char, short, int, long, float and double
        * */
        //Created a new package as a substitute for project to do demo in video: Primitive Types.
        System.out.println("This was done 09/28/19");





    }

}
