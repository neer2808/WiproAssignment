package exercisequestions;


/*
Given a number, you are expected to return a string containing a sequence of 'e', 'o' and 'z'
representing the sequence of even, odd, and zero digits in the given number.
The output string should also contain a prefix of either 'p' or 'n",
signifying whether the number is positive or negative.
Observe the below examples to understand this question.

Example 1:

input1=16338
Expected output = "poeooe" Explanation:
input1 is a positive number, so the prefix (first character of the output string) should be 'p'.
The sequence of digits in the input number are '1', '6', '3', '3' and '8',
i.e. we have an odd number '1', followed by an even number '6',
followed by an odd number '3', followed by an odd number '3',
followed by an even number '8'
So, the sequence of evens and odds in the given number is odd, even, odd, odd and even. i.e. "oeooe"
Therefore, the final output string is = "poeooe"
 */


public class Exercise1 {
  public static String show(int val) {
    char pos;
    int rem = 0;
    int val1 = val;
    String result = "";
    if(val>=0)
    {
      pos = 'p';
    }
    else
    {
      pos='n';
    }
    if(val ==0)
    {
      return "pz";
    }
    else {
      val = Math.abs(val);
      while (val > 0) {
        rem = val % 10;
        if (rem == 0) {
          result = result + "z";
        } else if (rem % 2 == 0)
          result = result + "e";
        else if (rem % 2 != 0) {
          result = result + "o";
        }
        val = val / 10;
      }
    }
    result = result + pos;
    StringBuffer sb = new StringBuffer(result);
    sb.reverse();
    return sb.toString();
  }
  public static void main(String[] args) {
    System.out.println(show(-25064));
  }
}
