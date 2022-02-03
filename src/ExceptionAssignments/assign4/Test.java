package ExceptionAssignments.assign4;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    UserRegistration obj1= new UserRegistration();
    Scanner s = new Scanner(System.in);
    String username = s.next();
    String country = s.next();
    obj1.registerUser(username,country);

  }
}
