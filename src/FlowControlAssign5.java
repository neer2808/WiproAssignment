import java.util.Scanner;
public class FlowControlAssign5 {
  public static void main(String[] args) {
    char ch;
    Scanner s = new Scanner(System.in);
    ch = s.next().charAt(0);
    if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
    {
      System.out.println("Alphabhet");
    }
    else if(ch>='0' && ch<='9')
    {
      System.out.println("Number");
    }
    else
    {
      System.out.println("Special Character");
    }
  }
}
