package StringAssignments;

public class StringAssign8 {
  public static void main(String[] args) {
    String str = "a*aab";
    String s1 = "";
    int pos = str.indexOf('*');
    if (pos == str.length()-1)
    {
      s1 = str.substring(0, pos - 1);
    }
    else if(pos== 0){
      s1 = str.substring(pos + 2);
    }
    else
    {
      s1 = str.substring(0, pos - 1) + str.substring(pos + 2);
    }

      System.out.println(s1);

    }
  }


