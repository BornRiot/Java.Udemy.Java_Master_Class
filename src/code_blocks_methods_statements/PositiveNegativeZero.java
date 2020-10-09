package code_blocks_methods_statements;
public class PositiveNegativeZero{
	public static void main(String[] args) {
		checkNumber(5);

	}

	public static void checkNumber(int num){
		if (num > 0){
			System.out.println("Positive");
		}
		else if (num < 0 ){
			System.out.println("Negative");
		}
		else
			System.out.println("zero");
	}
}