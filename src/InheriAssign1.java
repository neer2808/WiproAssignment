class Animal
{
  public void eat()
  {
    System.out.println("eat");
  }
  public void sleep()
  {
    System.out.println("sleep");
  }
}
class Bird extends Animal
{
  public void eat()
  {
    System.out.println("Bird eat");
  }
  public void sleep()
  {
    System.out.println("Bird sleep");
  }
  public void fly()
  {
    System.out.println("fly");
  }
}
public class InheriAssign1 {
  public static void main(String[] args) {
    Animal obj = new Animal();
    System.out.println("Animal class methods output");
    obj.eat();
    obj.sleep();
    System.out.println("Bird class Methods output");
    Bird obj1 = new Bird();
    obj1.eat();
    obj1.sleep();
    obj1.fly();
  }
}
