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

    // test output
    System.out.println("Hello " + (firstName) + getInital(lastName) + (favnum));

    s.close();
  } // end main method

  /*
   * Name: get initial
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInital(String n) {
    return n.substring(0, 1);
  } // end initialize method
}
