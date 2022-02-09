package StringAssignments;

public class StringAssign1 {
  public static void main(String[] args)
  {
    String str = "aeaea";

    StringBuffer str1 = new StringBuffer(str);
    str1.reverse();
    System.out.println(str1);
    int ans = str.compareTo(str1.toString());
    if (ans== 0)
    {
      System.out.println("Palendrome");
    } else
    {
      System.out.println("not palendrome");
    }
  }
// Second logic to immplement it


//    String str = "neken";
//    int mid = str.length() / 2;
//    int flag = 0;
//    for (int i = 0; i < mid; i++) {
//      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//        System.out.println(str.charAt(i) + "    " + str.charAt(str.length() - 1 - i));
//        flag = 1;
//        break;
//      }
//    }
//    if (flag == 1) {
//      System.out.println("not equal");
//    } else {
//      System.out.println("equal");
//    }
//  }
}



