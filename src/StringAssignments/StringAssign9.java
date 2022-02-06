package StringAssignments;

public class StringAssign9 {
  public static void main(String[] args) {
    String s1 = "aaaa";
    String s2 = "bbbbbbbb";
    int s1len = s1.length();
    int s2len = s2.length();
    String rstr = "";
    int i;

    if (s1.length() <= s2.length())
    {
      for (i = 0; i < s1.length() ; i++) {
        rstr = rstr + s1.charAt(i) + s2.charAt(i);
      }
    rstr = rstr + s2.substring(i);
  }
    else
    {
      for (i = 0; i < s2.length(); i++) {
        rstr = rstr + s1.charAt(i) + s2.charAt(i);
      }
      rstr = rstr + s1.substring(i);
    }
    System.out.println(rstr);
  }
}
