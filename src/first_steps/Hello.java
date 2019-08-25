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
        System.out.println("Hello, Tim Buchalka");


        /*
          "Variables"
          Def: Variables- used as a way to store info in the computer. Variables can be accessed
          by a name we give them.
          Def: Data Types- key words in java tht\at are used to define the type of info we are using. ex: int- short for
         integer
          Variables have to be initialized in java before being used.
          Def: Expression- is a construct that evaluates to a single value
         */

         int myFirstNumber = 5;
         //Challenge: print out the value of myFirstNumber on the screen
        System.out.println("The line below this statement is used to complete the challenge");
        System.out.println(myFirstNumber);
        //You can add even more complex expression to the right of the equal sign
        myFirstNumber = 11 + 7;
        System.out.println(myFirstNumber);
         //even more complex
        myFirstNumber = (11 + 7) + (10 * 8);
        System.out.println(myFirstNumber);

        System.out.println("This is just to test what the next commit does");


    }

}
