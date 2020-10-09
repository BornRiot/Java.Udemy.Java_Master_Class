package code_blocks_methods_statements;
import java.util.Random;
import java.util.Scanner;


public class test_array {
    public static void main(String[] args) {

        System.out.println(isCAtAPlaying(true,10));

    }
    public static boolean isCAtAPlaying(boolean summer, int temperature) {
        int [] tem_range = new int[46];
        int peak;
        if (summer){
            peak = 45;
            for(int i = 0; i <= peak;i++ ){
                tem_range[peak] = i;
                temperature = new Random().nextInt(tem_range.length);

            }
            System.out.println(temperature);
            System.out.println(tem_range[4]);


        }
        else if (!summer){
            peak = 35;
            for (int i = 0; i <= peak; i++){
                tem_range[peak] = i;
                temperature = new Random().nextInt(tem_range.length);
            }
            System.out.println(temperature);


        }
        return true;
    }

}
