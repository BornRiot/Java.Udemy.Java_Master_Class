package code_blocks_methods_statements;

public class CodeBlocks_IfTheEsleChallenge_45 {
    public static void main(String[] args) {
        //Defined variable as the are in the beginning of the video
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//         if(score < 5000  && score > 100){
//             System.out.println("Your score is less than 5000 but grater than 1000");
//         } else if(score < 100){
//             System.out.println("Your score is less than 1000");
//         }
//         else{
//             System.out.println("You got here ");
//         }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: "+ finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);

            //Vide stresses the point of code duplication which can cause errors in the long run
            //This cna be due to the fact that the code you are working with needs to be changed in several
            // places in your program and you forget to do so just by copying and pasting code
        }
    }
}
