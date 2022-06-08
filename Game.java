import java.util.Scanner;


public class Game{
    private String wordOfTheDay = "house";
    private int maxWordSize = 5;

    public Game(){
        //empty constructor
    }
    
    public String getWordOfTheDay(){
        return wordOfTheDay;
    }
   
   
    public boolean wordContains(char p){
       boolean contains=false;    
       for (int v=0;v<wordOfTheDay.length();v++){
           if(wordOfTheDay.charAt(v)==p)
             contains = true;
       }
        return contains;
    }
   
    public String analyzeUserInput(){
       System.out.print("Enter a Word:");
       Scanner guess = new Scanner(System.in);
       String userGuess = guess.nextLine();
       System.out.println("Your Entered Word : "+ userGuess);
      
       String output = ""; 
       
       if (userGuess.length() > maxWordSize){
            output = "Larger String" ;
       }else{
           for(int i=0;i <userGuess.length(); i++){
              if (wordOfTheDay.charAt(i)== userGuess.charAt(i)){
                //System.out.println(userGuess.charAt(i)+"* ");
                output = output + userGuess.charAt(i)+"* ";
              }else{
                  if(wordContains(userGuess.charAt(i))){
                      output = output + userGuess.charAt(i)+"# ";
                  }else{
                    //System.out.println(userGuess.charAt(i)+"! ");
                    output = output + userGuess.charAt(i)+"! ";
                  }//if
              }//if
           }//for
       }//if
       //System.out.println("output from Game:"+output);
       return output;
        
    }// end of analyzeUserInput
    
}// end of Game
