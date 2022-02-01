// prime number which is having two factors
public class FlowControlAssign13 {
  public static void main(String[] args) {
    int ctr; int j =0;
    for (int n = 10; n <99 ; n++) {
          ctr = 0;
          for(j =1; j<=n;j++)
          {
            if(n%j ==0)
            {
                ctr++;
            }
          }
          if(ctr ==2)
            System.out.println(n);
          }
    }
  }

