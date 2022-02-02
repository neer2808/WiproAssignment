import java.util.Scanner;

class Box
{
 private int width, height, depth;
  public Box(int width, int height, int depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }
  public int volume()
  {
    return (width*height*depth);
  }
}

public class ClassObjectAssign1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter width,height and depth");
    Box obj1 = new Box(s.nextInt(),s.nextInt(),s.nextInt());
    System.out.println("Volume is = "+ obj1.volume());

  }
}
