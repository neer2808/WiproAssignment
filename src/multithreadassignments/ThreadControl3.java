package multithreadassignments;


class MyThread10 extends  Thread
{
  public void run()
  {
    for (int i = 1; i <=10 ; i++) {
      System.out.println(i);
    }
  }
}
public class ThreadControl3 {
  public static void main(String[] args) {
    MyThread10 obj1 = new MyThread10();
    obj1.setPriority(Thread.MAX_PRIORITY);
    MyThread10 obj2 = new MyThread10();
    obj2.setPriority(Thread.MIN_PRIORITY);
    MyThread10 obj3 = new MyThread10();
    obj2.setPriority(Thread.NORM_PRIORITY);
    obj1.start();
    obj2.start();
    obj3.start();
  }

}
