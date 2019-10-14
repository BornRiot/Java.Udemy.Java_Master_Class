package first_steps;

public class Primitive_TypeChallenge_27 {
    public static void main(String[] args){

        byte testByte = 3;
        short testShort = 32767;
        int testInt = 12000;
        long getLongNum = 50000L + (10L * (testByte + testShort + testInt));
        System.out.println(getLongNum);
        //This is an example of implicit type casting


    }
}
