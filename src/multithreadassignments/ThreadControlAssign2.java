package multithreadassignments;
/*
Create two threads, one thread to display all even numbers between 1 & 20,
another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join
 */
class EvenThread extends  Thread {
  public void run() {
    oddThread.t = Thread.currentThread();
    for (int i = 1; i <=20 ; i++) {
          if(i%2 ==0)
          {
            System.out.println(i);
          }
    }
  }
}
class oddThread extends  Thread{
  public static Thread t;
  public void run()
  {
    try {
      t.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    for (int i = 1; i <=20 ; i++) {
      if(i%2 !=0)
      {
        System.out.println(i);
      }
    }
  }
}
public class ThreadControlAssign2 {
  public static void main(String[] args) {
    EvenThread obj1 = new EvenThread();
    oddThread obj2 = new oddThread();
    obj1.start();
    obj2.start();


  }
}
