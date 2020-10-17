package control_flow_statements;
import java.util.Scanner;

public class switch_statements_challenge {
    public static void main(String[] args) {
//    Crease Scanner Object
       Scanner takeInput = new Scanner(System.in);

//        example of a java switch statement

    System.out.println("Please enter a number  for switch case:   ");
    int switchValue = takeInput.nextInt();

    switch(switchValue){
        case 1:
            System.out.println("e");
            break;
        case 2:
            System.out.println("S");
            break;
        case 3:
            System.out.println("K");
            break;
//        Case statements can also be written in the following format
        case 4: case 5: case 6:
            System.out.println("Was a 4, or a 5 , or a 6");
            System.out.println("Case was actually a "+ switchValue );
            break;
        default:
            System.out.println("U");
            break;

//            You can use byte, char, short and int for the data types in Switch statements

        }

//        Beginning of char switch challenge:
        System.out.println("Please A, B, C, D or E for choice of Dessert");
        char theDessert = takeInput.next().charAt(0);// format for taking char input using scanner

        switch(theDessert){
            case 'A':
                System.out.println("The option chosen was "+ theDessert +": Apple Pie");
                break;
            case 'B':
                System.out.println("The option chosen was "+ theDessert +": Brownie");
                break;
            case 'C':
                System.out.println("The option chosen was "+ theDessert +": Cherry Cheese cake");
                break;
            case 'D':
                System.out.println("The option chosen was "+ theDessert +": Danish");
                break;
            case 'E':
                System.out.println("The option chosen was "+ theDessert +": Eclair");
                break;
            default:
                System.out.println("Neither A, B, C, D or E were chosen. ");
                break;
        }
    }
}
