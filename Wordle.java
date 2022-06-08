import java.util.Scanner;


public class Wordle
{   
    public static void main(String[] args)
    {
      int count = 0; 
      int maxtries = 6;
      
      System.out.println("************** WORDLE GAME **************");
      System.out.println("    -------- Rules to play --------");
      System.out.println(" --> Should be 5 lettered word.");
      System.out.println(" --> Please enter in all lowercase letters.");
      System.out.println(" --> An asterik * next to a letter means the letter");
      System.out.println("     is in the word and in the correct position,");
      System.out.println(" --> A hashtag # means the letter is in the word");
      System.out.println("     but the wrong position,");
      System.out.println(" --> An exclamation point ! means the letter is");
      System.out.println("     not in the word.");
      System.out.println(" --> NOTE: Please enter real words.  This program");
      System.out.println("           is not meant to detect whether a word");
      System.out.println("           exists or not.");
      
    Game wordle1 = new Game();
    while (count < maxtries){
        String returnValue = wordle1.analyzeUserInput();
        System.out.println("Your Score : "+returnValue);
        
        if(returnValue.equals("Larger String")){
            System.out.println("Remember the rule: This game is only for 5 lettered words");
        }else{
            int totalStars = 0;
            //count starts in retrunValue
            for (int i=0; i<returnValue.length();i++)
            {
                if(returnValue.charAt(i)=='*') 
                    totalStars=totalStars+1;
            }
            //System.out.println("totalStars = "+totalStars);
            if(totalStars==(wordle1.getWordOfTheDay().length())){
                System.out.println("You WON by guessing the right WORD : "+ wordle1.getWordOfTheDay()); 
                break;
            }else{
                count++;
                if(count==6){ 
                   System.out.println("You are left with 0 chances. Here is the WORD OF THE DAY : "+ wordle1.getWordOfTheDay());
                   break;
                }else{ 
                   System.out.println("You LOST.You are left with "+(maxtries-count)+" more chances"); 
                }
            }//if
        }//if
    }//While    
    } //main 
}//Wordle
