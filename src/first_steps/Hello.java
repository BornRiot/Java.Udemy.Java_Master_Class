package first_steps;

public class Hello {
    /*Write java programs following  a specific set of rules, using a combination of keywords and other resources
     you'll see which will collectively form a java program.
    **/
    //keywords in java are case sensitive
    //Access modifiers are used to define the access restrictions to classes in java
    //left and right curly braces are used ti define the class body.
     /* "Defining the Main Method"
     *  Def: Method-Is a collection of statements, one or more, that perform an operation.
     *  java uses the main method as an entry point for all java programs
     *  Def: void-keyword indicating that the method will return nothing after it is ran
      *  Def: Code block- is used to dei=fine a block of code in your program
      *  Def: Statement- A complete command to be executed and can include one or more expressions
     *  */

    public static void main(String[] args)  {// Def: Method-Is a collection of statements, one or more, that perform
        // an operation. Def: void-keyword indicating that the method will return nothing after it is ran
        System.out.println("Hello World"); //Def: Statement- A complete command to be executed and can include one or more
        // expressions

        /*

         * "Hello World challenge and common errors"
         *  Challenge of the video was to modify the program to personalize the Hello World print out
         *  You can double click in the run window on the errors that appear to go to the line that they were created.
         *  The text in double quotes of a java program are called a literal string
         */
        //Challenge attempt:
        System.out.println("The line printed below this statement is for the first course challenge");
        System.out.println("Hello, Tim Buchalka");//The "Hello, Tim Buchalka, in the previous statement is known as
        // a string literal


        /*
          "Variables"
          Def: Variables- used as a way to store info in the computer. Variables can be accessed
          by a name we give them.
          Def: Data Types- key words in java tht\at are used to define the type of info we are using. ex: int- short for
         integer
          Variables have to be initialized in java before being used.
          Def: Expression- is a construct that evaluates to a single value
          Def: Data types are diff types of data that can be used to identify variables like integers, strings and
           decimals
         */

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




    }

}
