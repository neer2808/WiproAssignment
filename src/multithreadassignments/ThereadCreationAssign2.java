package multithreadassignments;

/*
store colours in the form of an array

ex: String colours[]={"white","blue","black","green","red","yellow"};

display all colours repeatedly by generating colour index from Random class.

If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface
 */
import java.util.Random;
class Mythread3 implements Runnable {
  @Override
  public void run() {
    Random rand = new Random();
    String colours[] = {"white","blue","black","green","red","yellow"};

    boolean exit= false;
    // System.out.println(num);
    while(!exit)
    {
      int num = rand.nextInt(5);
      switch(num)
      {
        case 0:
          System.out.println(colours[0]);
          break;
        case 1:
          System.out.println(colours[1]);
          break;
        case 2:
          System.out.println(colours[2]);
          break;
        case 3:
          System.out.println(colours[3]);
        case 4:
          //System.exit(0);
          exit = true;
          break;
        case 5:
          System.out.println(colours[5]);
          break;
      }
    }
  }
}
class ThreadCreationAssign2  {
  public static void main(String[] args) {
    Mythread3 obj = new Mythread3();
    Thread t1 = new Thread(obj);
    t1.start();
  }

}
