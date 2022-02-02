import java.util.Scanner;
public class ArrayAssign5 {
  public static void main(String[] args) {
    int arr[] = new int[10];
    Scanner s = new Scanner(System.in);
    System.out.println("Enter 10 values");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt();
    }
    int min1, min2, max1, max2;
    min1 = min2 = Integer.MAX_VALUE;
    max1 = max2 = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max1) {
        max2 = max1;
        max1 = arr[i];
      } else if (arr[i] > max2) {
        max2 = arr[i];
      }
      if(min1>arr[i] ) {
        min2 = min1;
        min1 = arr[i];
      }else if (min2>arr[i])
        min2 = arr[1];
    }
    System.out.println("Max value=" +max1 + "\t"+ max2);
    System.out.println("Min value=" + min1 + "\t"+ min2);
  }
}





