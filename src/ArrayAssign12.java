public class ArrayAssign12 {
  public static void middleway(int[] a,int[] b)
  {
    int resultarr[] =new int[2];
    resultarr[0] = a[1];
    resultarr[1] = b[1];
    for(int i=0;i<resultarr.length;i++)
      System.out.print(resultarr[i]+" ");
  }
  public static void main(String[] args) {
    int a[] ={1,2,3};
    int b[] ={4,5,6};
    middleway(a,b);
  }
}
