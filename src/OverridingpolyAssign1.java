import java.util.Scanner;

class Fruit
{
  String name;
  String taste;
  int size;
  public void eat()
  {
    Scanner s = new Scanner(System.in);
    name =s.next();
    taste= s.next();
    s.close();
  }
}//  End of the class Fruit
class Apple extends Fruit
{
  public void eat()
  {
    name = "Apple";
    taste = "Sweet";
    System.out.println(name +"\t" + taste);
  }
}// end of the class Apple
class Orange extends Fruit{
  public void eat()
  {
    name = "Orange";
    taste = "bitter";
    System.out.println(name + "\t" + taste);
  }

} // End of the class Orange
 public class OverridingpolyAssign1 {
   public static void main(String[] args) {
     Apple obj = new Apple();
     obj.eat();
     Orange obj2 = new Orange();
     obj2.eat();
   }
}
