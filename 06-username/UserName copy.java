import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    /*
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
    */
    s.close();
    generatePassword(0);
    }
  public static String getInital(String n) {
    return n.substring(0, 1);
    
  }
  public static String generatePassword(int length){
    String password = "";
    int max, min;
    
    
    //System.out.println(rand + c);
    for (int i = 0; i < 10; i++){
        int choice  = (int)(Math.random()*(3) + 1);
        if (choice == 1);
          min = 65;
          max = 90;
          
        int rand = (char)(int)(Math.random()*(max-min+1)+min);
        char c = (char)(rand);
        password += c;
        System.out.println(password + rand + c);
        
        
        
    }
     // end initialize method
     // purpose to send back a random String of Numbers, uppercase and lowercase letters
    return password;
    }
 }  
