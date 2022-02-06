package StringAssignments;

public class StringAssign3 {

  public static void main(String[] args) {
    String s = "Neeraj";
    int n = s.length();
    String s1 = "";
    if (n < 2)
      s1 = s;
    else
      s1 = s.substring(0, 2);
    String s2 = "";
    for (int i = 0; i < n; i++) {
      s2 =s2 + s1;
    }
    System.out.println(s2);

  }
  }
