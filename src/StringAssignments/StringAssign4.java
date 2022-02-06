package StringAssignments;

import java.util.Scanner;

public class StringAssign4 {
  public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    String s = s1.next();
    int n = s.length();
    if(n%2==0)
    {
      for (int i=0;i<(n/2);i++)
        System.out.print(s.charAt(i));
    }
    else
      System.out.println("null");
  }
  }

