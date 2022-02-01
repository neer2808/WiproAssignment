public class FlowControlAssign1part2 {
  public static void lastDigit(int ta, int tb)
  {
    int rem1 = ta%10;
    int rem2 = tb%10;
    if (rem1 == rem2)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }
  public static void main(String[] args) {
    lastDigit(3, 13);

  }
}
