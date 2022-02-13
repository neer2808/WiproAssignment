package multithreadassignments;
/*
Create a thread which prints 1 to 10.
After printing 5, there should be a delay of 5000 milliseconds before printing 6
 */
class Threadcontrol1 extends Thread
{
  public void run()
  {
    for (int i = 1; i <=10 ; i++) {
      System.out.println(i);
      if(i == 5)
      {
        try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
public class ThreadControlAssign1 {
  public static void main(String[] args) {
    Threadcontrol1 obj = new Threadcontrol1();
    obj.start();
  }
}
