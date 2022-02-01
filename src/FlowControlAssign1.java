import java.util.Scanner;
public class FlowControlAssign1 {
  public static void main(String[] args) {
    int num;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    if(num>0)
    {
      System.out.println("No is positive");
    }
    else if(num<0)
    {
      System.out.println("No is negative");
    }
    else if(num ==0 )
    {
      System.out.println("No is zero");
    }
  }
}
