import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Wordle
{   
    public static void main(String[] args)
    {
      Game wordle1 = new Game("house" , 0);
      System.out.println("Hi there!  Guess the five letter word in 6 tries!");
      System.out.println("Green means that the letter is in the word and in the correct position, Yellow means that the letter");
      System.out.println("is in the word but the wrong position, Red means that the letter is not in the word.");
    }
}
