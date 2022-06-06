import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Game{
    private int count;
    private String wordOfTheDay;
    
    public Game(int count, String wordOfTheDay){
        this.count = count;
        this.wordOfTheDay = wordOfTheDay;
    }
    
    public int getCount(){
        return count;
    }
    
    public String getWordOfTheDay(){
        return wordOfTheDay;
    }
    
    
    public String analyzeUserInput(String answer){
        int count = 0;
        String wordOfTheDay = "house";
        
        while(count<7){
            
            //method must be able to return inputted word in three different colors
            //method must scan each letter in user input and compare it to wordOfTheDay
            //method should print the letters in user input in green if the letter is guessed in the correct spot
            //method should print the letters in user input in yellow if the letter is guessed correctly but not in the correct spot
            //method should print the letters in user input in red if the letter is guessed wrong and not located in wordOfTheDay
            //method count up after each time the user input is evaluated.
            //if user input is not exactly 5 letters, count doesn't go up.  Instead method should print.  Try a word with 5 letters and repeat ask user method again.  Then analyze user input should be applied to that word.
            //count goes up if user input is exactly five letters but after it is decided which color each letter will be.
                        
            
            //giant method start
            
       Scanner guess = new Scanner(System.in);
       System.out.println("Enter a Five Letter Word:");
       String answer = guess.nextLine();
       System.out.println("You guessed " + answer);
            
       String[] userGuess = new String[];
      
                for(int i = 0; i < answer.length; i++){
                   userGuess[i] = answer.substring(i);
                }
           
            if(answer.length() == 5){
            
            if(answer.equals(wordOfTheDay)){
                System.out.println(ANSI_GREEN + answer + ANSI_RESET);
                count++;
            }
             else{
                   for(int j = 0; j < answer.length; j++){
                       if(userGuess[i].equals(wordOfTheDay.substring(i))){
                            System.out.print(ANSI_GREEN + userGuess[i] + ANSI_RESET);
                           count++;
                       }
                       else if(!userGuess[i].equals(wordOfTheDay.substring(i))){
                            for(int k = j+1; k < answer.length; k++){
                               if(userGuess[i].equals(wordOfTheDay.substring(k))){
                                   System.out.print(ANSI_YELLOW + userGuess[i] + ANSI_RESET);
                                   count++;
                               }
                               else{
                                   System.out.print(ANSI_RED + userGuess[i] + ANSI_RESET);
                                   count++;
                               }
                            }
                       }
                       else{
                          System.out.println(ANSI_RED + answer + ANSI_RESET);
                          count++; 
                       }
                
                 
                  }
             }
                else{
                    System.out.println("Please enter a word that is 5 letters in length");
                    Scanner guess = new Scanner(System.in);
                    System.out.println("Enter a Five Letter Word:");
                    String answer = guess.nextLine();
                    System.out.println("You guessed " + answer);
                    count == count;
       }
                
            
            }
            
            //giant method end
        }
        
        System.out.println("Whoops sorry!  You are out of tries.  Try again tomorrow.");
        System.out.println("The correct word was: " + wordOfTheDay);
            
       }
        
    }
}

public class MyClass {
    public static void main(String args[]) {
      System.out.println("Hi there!  Guess the five letter word in 6 tries!");
      System.out.println("Green means that the letter is in the word and in the correct position, Yellow means that the letter");
      System.out.println("is in the word but the wrong position, Red means that the letter is not in the word.");
    }
}
