package code_blocks_methods_statements;

public class MoreMethodsandChallenge_48 {
    public static void main(String[] args) {

    	//the method should receive a players as parameter
       int firstScore = calculateHighScore(1500);
       displayHighScores("Michael", firstScore);

       int secScore = calculateHighScore(900);
       displayHighScores("George", secScore);

       int thirdScore = calculateHighScore(400);
       displayHighScores("Casey",thirdScore);

       int fourthScore = calculateHighScore(50);
       displayHighScores("Nathaniel", fourthScore);

       System.out.println(); 





    }

    public static void displayHighScores(String playersName, int position){
    	System.out.println(playersName + " managed to get the position:  " + position);


    }

    public static int calculateHighScoreFinal(int playerScore ){
    	int playerPosition = 4; 
    	if(playerScore >= 1000){
    		playerPosition = 1; 

    	}
    	else if (playerScore >= 500){
    		playerPosition = 2; 
    	}
    	else if (playerScore >= 100 ){
    		playerPosition = 3; 
    	}
    	
    	return playerPosition; 

    }

    

    public static int calculateHighScore(int playerScore){ 
    	if (playerScore >= 1000 ){
    		return 1;
    	
    	}
    	else if (playerScore >= 500 && playerScore < 1000){
    		return 2;
    	}
    	else if(playerScore >= 100 && playerScore < 500  ){//These lines of codes can be deleted. AThe resultd of the program would be the same.
    		return 3; 
    	}

    	return 4; 

    	//There was an error in the instructions given by the tim which resulted in the wrong output when given arguments for 
    	//playerScore = 1000. The constraints should be greater than or equal to.  
    }
}
