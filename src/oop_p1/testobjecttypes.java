package databases;
public class testobjecttypes {
    static int SumNum = 5;
    public static void main(String[] args) {
        sevenKnives(4);
        System.out.println(sevenKnives(5));
        System.out.println();
        testobjecttypes obj1  = new testobjecttypes();
        System.out.println("This is the result: "+obj1.SumNum);
        Integer  newInt =  new Integer(1);
        System.out.println(newInt.intValue());
        int[] myArray = new int[10];
        myArray[4] = 5;

    }
    public  void tryThis(){
        SumNum++;
    }


    public static int sevenKnives(int count){
        int result;

        result = count * 2;

        return result;

    }

}
