package ExceptionExample2;

public class SalException extends Exception{
  public SalException(String message) {
    super(message);
  }
  public SalException() {
    super();
  }

  @Override
  public String toString() {
    return "SalException{sal should not be less then 10000 }";
  }
}
