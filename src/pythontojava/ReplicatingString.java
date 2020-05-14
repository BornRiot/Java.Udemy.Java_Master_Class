/**
 * This code was created to replicate the procedure of grabbing
 *  each word in a sentence and printing the first letter of each word.
 *  This is a topic that was covered in my python class that I felt the
 *  need to practice in java also.
 *
 */

package pythontojava;

public class ReplicatingString {
    public static void main(String[] args) {
        String theMessage = "Federal Aviation Administration";
        String[] words = theMessage.split(" ");

        for(String eachWord : words) {
            System.out.print(eachWord.charAt(0));
        }     }
 }

