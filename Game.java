import java.util.Scanner;

public class Game {
    
   private int guessCount;
   private String wordOfTheDay;
   
    public Game(String wordOfTheDay, int count){
        this.guessCount = count;
        this.wordOfTheDay = wordOfTheDay;
    }
    
    
    public String getWordOfTheDay(){
    
        String wordOfTheDay = "house";
        return wordOfTheDay;
  
    }
    
    public String wordle(String wordOfTheDay){
        
       int guessCount = 0;
       
       while(guessCount<7){
        
       Scanner guess = new Scanner(System.in);
       System.out.println("Enter a Five Letter Word:");
       String answer = guess.nextLine();
       System.out.println(answer);
      
     
      
      if(answer.equals(wordOfTheDay)){
          return "Yes, you guessed the correct word!";
          guessCount++;
      }
       else if(answer.length() == wordOfTheDay.length() && answer.length() < 6){
           String[] userGuess = new String[5];
           for(int i = 0; i<guess.length(); i++){
               userGuess[i] = guess.substring(i);
           }
          
           String[] actualWord = new String[5];
           for(int j = 0; j<wordOfTheDay.length(); j++){
               actualWord[j] = wordOfTheDay.substring(j);
           }
           
           for(int k = 0; k<userGuess.length(); k++){
               if(userGuess[k] == actualWord[k]){
                   return guess.substring(k) + " is at position " + (k+1);
                   guessCount++;
               }
               else{
                   for(int l = k+1; l<actualWord.length(); l++){
                       if(userGuess[k] == actualWord[l]){
                         return guess.substring(k) + " is in the word"; 
                         guessCount++;
                       }
                       else{
                           return guess.substring(k) + " is not in the word";
                           guessCount++;
                       }
                   }
                   }
               }
           }
           
           
           
       } 
            if(guessCount>6){
                return "Sorry.  You are out of tries.  The correct word was: " + wordOfTheDay;    
            }
}
}
