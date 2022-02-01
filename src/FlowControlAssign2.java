import java.util.Scanner;
public class FlowControlAssign2 {
  public static void main(String[] args) {
    int num;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    if(num%2==0)
    {
      System.out.println("No is even");
    }
    else
    {
      System.out.println("No is odd");
    }
  }
}
