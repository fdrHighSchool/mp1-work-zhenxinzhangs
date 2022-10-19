
/**
 * Write a description of class Scanner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.println("What is your average grade this semester?");
                int num = input.nextInt();
                if (num < 90){
                    System.out.println("You have a bad average");
                    
                }// ends if statment
                else {
                    System.out.println("NICE GRADE");
                }
    }
}
