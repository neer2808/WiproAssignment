package StringAssignments;

import java.util.Scanner;

public class StringAssign2 {

  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    String s1,s2,s3;
    s1=s.next();
    s2=s.next();
    if(s1.charAt(s1.length()-1)==s2.charAt(0))
      s3=s1 + s2.substring(1);
    else
      s3=s1+""+s2;
    System.out.println(s3);
  }
}
