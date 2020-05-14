/**
          "Variables"
          Def: Variables- used as a way to store info in the computer. Variables can be accessed
          by a name we give them.
          Def: Data Types- key words in java that are used to define the type of info we are using. ex: int- short for
         integer
          Variables have to be initialized in java before being used.
          Def: Expression- is a construct that evaluates to a single value
          Def: Data types are diff types of data that can be used to identify variables like integers, strings and
           decimals
            To use a variable, we must first  assign a variable type then a name and optionally initialize the
            variable with  a value

 */
package first_steps;

public class Variables_22 {
    public static void main(String[] args){
    int myFirstNumber = 5; // It is common practice to capitalize  the second and every other word in java variables
        //Def: Declaration statement: Is used to define a variable by assigning the data tye, name and optionally
        // setting a value when creating a variable.

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
    //Def: String literal- Any sequence of characters surrounded by double quotes. The values of string literals cannot
    // be changed


}
}
