package packageassignments.first;
import packageassignments.first.test.Foundation;
public class Test {
  public static void main(String[] args) {
    Foundation obj = new Foundation();
    obj.var4= 20;
    System.out.println(obj.var4);
    // default variables have only package accessibility
    // public we can access everywhere (inside the same package, outside the package, in sub and non sub classes
    // private we cannot access outside the class
    // protected we can access in same package sub and non subclasses and another package subclasses only

  }
}
