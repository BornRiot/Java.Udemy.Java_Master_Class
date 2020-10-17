package control_flow_statements;

public class NumberInWord {

    public static void main(String[] args) {

        printNumberInWord(5);
    }
    public static void printNumberInWord(int number){
        String result = "";
        switch(number){
            case 0:
                result = "ZERO";
                System.out.println(result);
                break;
            case 1:
                result = "ONE";
                System.out.println(result);

                break;
            case 2:
                result = "TWO";
                System.out.println(result);
                break;
            case 3:
                result = "THREE";
                System.out.println(result);
                break;
            case 4:
                result = "FOUR";
                System.out.println(result);
                break;
            case 5:
                result = "FIVE";
                System.out.println(result);
                break;
            case 6:
                result = "SIX";
                System.out.println(result);
                break;
            case 7:
                result = "SEVEN";
                System.out.println(result);
                break;
            case 8:
                result = "EIGHT";
                System.out.println(result);
                break;
            case 9:
                result = "NINE";
                System.out.println(result);
                break;
            default:
                result = "OTHER";
                System.out.println(result);
                break;


        }
    }



}
