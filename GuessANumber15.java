package org.phs.princetonk12.org.testers.githubtrial;

import java.util.Scanner;

public class GuessANumber15 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = (int)(Math.random() * 100 + 1);
    int numGuesses = 0;
    
    boolean wrongGuess = true;
    
    int input;
    
    
    while(wrongGuess){
      System.out.println("Guess a number between 1 and 100");
      input = scanner.nextInt();
      numGuesses++;
      if(input == number){
        System.out.println("Excellent! You guessed the number! You guessed in " + numGuesses + " tries. Would you like to play again (y/n)?");
        String response = scanner.next();
        if(response.equalsIgnoreCase("Yes")){
          numGuesses = 0;
          number = (int)(Math.random() * 100 + 1);
        } else{
          wrongGuess = false;
          break;
        }
      }else if(input < number){
        System.out.println("Too low, guess again");
      } else if(input > number){
        System.out.println("Too high, guess again");
      }
    }
    
  }
}
