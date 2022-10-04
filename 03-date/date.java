
/**
 * Write a description of class date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class date{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // creates a scanner
        System.out.println("What day is it yo?");
        String day = s.nextLine(); // reads user input
        
        System.out.println("What month is it yo?");
        String month = s.nextLine(); // reads user input
        
        System.out.println("What year is it yo?");
        String year = s.nextLine(); // reads user input
        
        System.out.println("What day of the month is it yo?");
        String dayoftheMonth = s.nextLine(); // reads user input
        
        System.out.println("American format: It is, " + day + ", " + month + " " + dayoftheMonth + ", " + year);
        System.out.println("European format: It is " + day + " " + month + " " + dayoftheMonth + " " + year);
    } // closes main
} // closes date
