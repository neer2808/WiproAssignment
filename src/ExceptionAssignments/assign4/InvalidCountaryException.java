package ExceptionAssignments.assign4;

public class InvalidCountaryException extends  Exception {
  public InvalidCountaryException()
  {
    super();
  }
  public InvalidCountaryException(String message)
  {
  super(message);
  }
  @Override
  public String toString() {
    return "InvalidCountaryException";
  }
}
