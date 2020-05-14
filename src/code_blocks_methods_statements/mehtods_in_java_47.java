package code_blocks_methods_statements;

public class mehtods_in_java_47 {
    public static void main(String[] args) {


    }

public static int  calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
	if(gameOver){
		int finalScore = score + (levelCompleted * bonus);
		finalScore +=1000;
		System.out.println("Your final score was: "+ finalScore);
		return finalScore; 

	}
	else 
		return -1;


}
public static void calculateScoreV(){
	int score =  500;
	int levelCompleted = 5;
	int bonus = 100;
	boolean gameOver = true; 

	if(gameOver){
		int finalScore = score + (levelCompleted * bonus);
		finalScore +=1000;
		System.out.println("Your final score was: "+ finalScore);

	}
}

    public static void calculateScore (int score, int levelCompleted, int bonus){
        //This is the method i created before seeing the videos solution
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score was: " + finalScore);
        


    }
}
