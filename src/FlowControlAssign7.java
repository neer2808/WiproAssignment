import java.util.Scanner;
public class FlowControlAssign7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char ch = s.next().charAt(0);
    if(ch>='a'&& ch<='z')
    {
      ch = (char) (ch-32);
      System.out.println(ch);
    }
    else if(ch>='A' && ch<='Z')
    {
      // type casting into char type
      ch = (char) (ch+32);
      System.out.println(ch);
    }
  }
}
