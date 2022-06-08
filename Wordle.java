import java.util.Scanner;


public class Wordle
{   
    public static void main(String[] args)
    {
      int count = 0; 
      int maxtries = 6;
      
      System.out.println("************** WORDLE GAME **************");
      System.out.println("---Rules---");
     // System.out.println("Should be 5 lettered word; case sensitive; next to a letter means that the letter is in the word and in the correct position, # means that the letter");
     // System.out.println("is in the word but the wrong position, ! means that the letter is not in the word.");
     // System.out.println();
      
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
            if(totalStars==5){
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
