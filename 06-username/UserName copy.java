import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    // get String input from user
    System.out.println("Enter your favorite number: ");
    String favnum = s.nextLine();
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    
    System.out.print("Are you a student or teacher?");
    String question = s.nextLine(); 
    if (question .equals ("student")){     
    System.out.println("Hello " + (firstName) + getInital(lastName) + (favnum) + "@nycstudents.net");        
    }
    if (question .equals ("teacher")){
    System.out.println("Hello " + getInital(firstName) + (lastName) + (favnum) + "@schools.nyc.gov");
    }
    
    
    System.out.print("How long of a password? ");
    int len = s.nextInt();
    
    System.out.println(generatePassword(len));
    s.close();
    generatePassword(0);
    }
  public static String getInital(String n) {
    return n.substring(0, 1);
    
  }
  public static String generatePassword(int length) {
    String password = "";
    int min, max;

    for(int i = 0; i < length; i++) {
      // generate a random number
      // 65 - 90 capital letter
      // 97 - 122 lower case
      // 33 - 47 special symbols
      int choice = (int)(Math.random()*(3) + 1);

      if (choice == 1) {
        min = 65;
        max = 90;
      }

      else if (choice == 2) {
        min = 97;
        max = 122;
      }

      else {
        min = 33;
        max = 47;
      }

      int rand = (int)(Math.random()*(max-min+1) + min);

      // convert the int ---> character c =(char)i;
      char c = (char)rand;
      // System.out.println(rand + " " + c);

      // add the char to the password String
      password = password + c; // password += c;

    } // end for loop
     // end initialize method
     // purpose to send back a random String of Numbers, uppercase and lowercase letters
    return password;
    }
 }  
