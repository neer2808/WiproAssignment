public class ArrayAssign14 {
  public static void main(String[] args) {
    int a[][] = new int[3][3], k = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        a[i][j] = Integer.parseInt(args[k]);
        k++;
      }
    }
//highest number in 2d array
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i][j] > max)
          max = a[i][j];
      }
      System.out.println();
    }
    System.out.print("The biggest number in the given array is " + max);
  }
}

