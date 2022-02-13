package multithreadassignments;
/*
Create two threads and assign names 'Scooby and 'Shaggy'to the two threads.
Display both thread names.
 */
class MyThread1 extends Thread
{
  public void run()
  {
    System.out.println(currentThread().getName());
  }
}
class MyThread2 extends Thread
{
  public void run()
  {
    System.out.println(currentThread().getName());
  }
}

public class ThreadCreationAssign1 {
  public static void main(String[] args) {
  MyThread1 t1 = new MyThread1();
  MyThread2 t2 = new MyThread2();
    t1.setName("Scooby");
    t2.setName("Shaggy");
    t1.start();
    t2.start();

  }
}
