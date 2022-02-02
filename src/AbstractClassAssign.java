import java.util.Random;

abstract class Compartment
{
  public abstract String notice();
}


class FirstClass extends Compartment
{
  @Override
  public String notice() {

    return "First Class";
  }
}
class Ladies extends  Compartment
{

  @Override
  public String notice() {

    return "Ladies Class";
  }
}
class General extends Compartment
{

  @Override
  public String notice() {

    return "General Class";
  }
}
class Luggage extends Compartment
{

  @Override
  public String notice() {

    return "Luggage class";
  }
}


class TestCompartments
{
  public static void main(String[] args) {
    Compartment arr[] = new Compartment[10];
    int max = 4;
    int min = 1;
    for (int i = 0; i < arr.length; i++) {
        int random =(int) (Math.random()*(max-min+1)+min);
      System.out.println(random);
      switch (random)
      {
        case 1:
            arr[i]= new FirstClass();
            break;
        case 2:
          arr[i]= new Ladies();
          break;
        case 3:
          arr[i] = new General();
          break;
        case 4:
          arr[i] = new Luggage();
          break;
      }
      System.out.println(arr[i].notice());
    }

  }
}








public class AbstractClassAssign {

}
