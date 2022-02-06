package StringAssignments;

public class StringAssign6 {
  public static void main(String[] args) {
    String s1 = "hi";
    String s2 = "hello";
    String s3;
    if (s1.length() < s2.length())
      s3 = s1 + s2 + s1;
    else
      s3 = s2 + s1 + s2;
    System.out.println(s3);
  }
}
