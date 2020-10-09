package code_blocks_methods_statements;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(14));
        System.out.println(area(19,7));

    }

    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        else {

            return Math.PI * Math.pow(radius,2);
        }

    }

    public static double area(double x, double y){
        if ((x < 0) || (y < 0)||(x < 0 && y < 0 )){
            return -1.0;
        }
        else{
            return x * y;
        }

    }
}
