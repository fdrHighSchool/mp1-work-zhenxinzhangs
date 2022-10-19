
/**
 * Write a description of class rng here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    int mystery = 5;
    System.out.print("Enter your guess: ");
    int Guess = s.nextInt();

    if(Guess != mystery) {

      if (Guess < mystery){
        System.out.println("You were off by " + (mystery - Guess));    
      }
      else {
        System.out.println("You were off by " + (Guess - mystery));
      }    
    }
    else {
      System.out.println("correct");
    }
  }
}
