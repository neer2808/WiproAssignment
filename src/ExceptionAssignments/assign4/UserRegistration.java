package ExceptionAssignments.assign4;

public class UserRegistration {
  void registerUser(String username, String usercountry)
  {
    try {
      if (usercountry.equals("India") != true) {
        throw new InvalidCountaryException("User outside India cannot be registered");
      }
      else
      {
        System.out.println("user registration done successfully");
      }
    }
    catch(InvalidCountaryException e)
    {
      System.out.println(e);
      System.out.println(e.getMessage());
    }
  }
}
