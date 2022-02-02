import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAssign7 {
  public static ArrayList<Integer> duplicates(int arr[])
  {
    ArrayList<Integer> obj = new ArrayList<>();
    obj.add(arr[0]);
    int count=1;
    for (int i = 1; i <arr.length ; i++) {
      if(arr[i] != arr[i-1])
      {
        obj.add(arr[i]);
        count++;
      }
    }
    return obj;
//    int arr1[] = new int[count];
//    arr1[0]= arr[0];
//    for (int i = 1 ,j=1; i <arr.length ; i++) {
//      if(arr[i] != arr[i-1])
//      {
//        arr1[j] = arr[i];
//        j++;
//      }
//    }
//    for (int i = 0; i <arr1.length ; i++) {
//      System.out.println(arr1[i]);
//    }
//
//    System.out.println("using array and linkedlist");

  }
  public static void main(String[] args) {
    int arr[] = {10,20,50,90,50,10};
    Arrays.sort(arr);
    ArrayList<Integer>result = duplicates(arr);
    System.out.println(result);
  }



}



