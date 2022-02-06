package StringAssignments;

import java.util.Scanner;

public class StringAssign5 {
  public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    String s = s1.next();
    int n = s.length();
    for (int i=1;i<n-1;i++)
      System.out.print(s.charAt(i));
  }
}
