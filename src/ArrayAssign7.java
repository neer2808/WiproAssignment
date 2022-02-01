public class ArrayAssign7 {

//  public static void  duplicate(int a[], int n)
//  {
//    if (n == 0 || n == 1) {
//     return;
//    }
//    //temp array used to copy the elements
//    int[] temp = new int[n];
//    int j=0;
//
//    for (int i = 0; i < n - 1; i++) {
//      if (a[i] != a[i + 1]) {
//        temp[j++] = a[i];
//      }
//    }
//    temp[j++] = a[n - 1];
//
//    for (int i = 0; i <j ; i++) {
//      System.out.println(temp[i]);
//    }
//
//  }
  public static void main(String[] args)
  {
//    int arr[] = { 3,2,2};
//    int n = arr.length;
//    duplicate(arr, n);

    int a[] = {2,3,3,2 };
    int n = a.length;

    // m will have the maximum element in the array.
    int m = 0;

    for (int i = 0; i < n; i++) {
      m = Math.max(m, a[i]);
    }

    // creating the frequency array
    int[] f = new int[m + 1];

    // initializing the f[] with 0
    for (int i = 0; i < m + 1; i++) {
      f[i] = 0;
    }

    // incrementing the value at a[i]th index
    // in the frequency array
    for (int i = 0; i < n; i++)
    {
      f[a[i]]++;
    }
    for (int i = 0; i < m + 1; i++)
    {
      // if the frequency of the particular element
      // is greater than 0, then print it once
      if (f[i] > 0) {
        System.out.print(i + " ");
      }
    }
  }
  }


