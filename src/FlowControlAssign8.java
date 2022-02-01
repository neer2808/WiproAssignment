
import java.util.Scanner;
public class FlowControlAssign8 {
  public static void main(String[] args) {
    char ch = new Scanner(System.in).next().charAt(0);
    switch(ch)
    {
      case 'R':
      case 'r':
        System.out.println("R-> Red");
        break;
      case 'B':
      case'b':
        System.out.println("B->Blue");
        break;
      case'G':
      case'g':
        System.out.println("G-> Green");
        break;
      case 'W':
      case 'w':
        System.out.println("W-> White");
        break;
      case 'O':
      case'o':
        System.out.println("O-> Orange");
        break;
      case'Y':
      case'y':
        System.out.println("Y-> Yellow");
        break;
      default:
        System.out.println("Invalid Code");
    }
  }
}
