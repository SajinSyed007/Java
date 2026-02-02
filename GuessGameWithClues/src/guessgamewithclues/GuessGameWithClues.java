
package guessgamewithclues;

import java.util.Scanner;


public class GuessGameWithClues {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*10);
        
        int chance = 3;
        boolean win = false;
        
        System.out.println("Guess a number between 0-9 :- ");
        
        
        
        while (chance >= 1 ) {
            
            System.out.println("Enter your guess (" + chance + "chances left): ");
            int guessNumber = s.nextInt();
            
            if(guessNumber == randomNumber){
                System.out.println("Hurrah !!! Perfect Guess.");
                win = true;
                break;
            }
            
            else if(guessNumber > randomNumber){
                System.out.println("Again think a number(Smaller) :- ");  
            } 
            
            else{
                System.out.println("Again think a number(Bigger) :- "); 
           }
            chance--;
        }
        if(!win){
            System.out.println("Better luck next time...");}
        System.out.println("Computer guessed it " + randomNumber);
        
    }
    
}
