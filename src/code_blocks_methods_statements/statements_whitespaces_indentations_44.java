/**
 * This video cover the topic of statements, whitespaces and indentations for video 44 in this section of the course
 */
package code_blocks_methods_statements;

public class statements_whitespaces_indentations_44 {

    public static void main(String[] args) {

        int myVariable = 50;

        if (myVariable == 50) {
            System.out.println("Printed");
        }


        myVariable++; //Statement
        myVariable--; //Statement
        System.out.println("This is a test"); //Statement

        System.out.println("This is" + //This is
                " another" + //an example
                " still more."); //of multi line statements

        int anotherVariable = 50;
        myVariable--; //example of multi statements on the same line
        System.out.println("This is another one");

        //Indentation in programming is primarily used to make the code more readable for its users and those who are
        //next to have access to it
        //There is an option in IntelliJ under the "Code" menu that allows you to reformat your code to indent it automatically
        System.out.println("This is to test if all the IDE resources work after implementing an update ");
    }
}
