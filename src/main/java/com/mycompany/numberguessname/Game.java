package com.mycompany.numberguessname;

/**
 *
 * @author akshay
 */
import java.util.Random;
import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    Random Random_number= new Random();
    int correct_guess=Random_number.nextInt(100);
    int turns=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("\nGUESS A NUMBER BETWEEN 1 TO 100, \nYou will have 10 turns!" );
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      guess=scan.nextInt();
      turns++;
    
    if(guess==correct_guess) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose! the right answer was: "+correct_guess);
      System.out.println("Better Luck Next Time");
      return;
    }
    else if(guess<correct_guess){
      i++;
      System.out.println("Yor Guess is lower than the right guess!\nTry Higher Turns left: "+(10-i));
      
      
      
    }
    else if(guess>correct_guess) {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess!\nTry Lower Turns left: "+(10-i));
      
    }
   
    
    
  }
    System.out.println("YOU WIN!");
    System.out.println("The number is "+correct_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
    
}
}