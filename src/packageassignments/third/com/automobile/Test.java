package packageassignments.third.com.automobile;

import packageassignments.third.com.automobile.FourWheeler.Ford;
import packageassignments.third.com.automobile.FourWheeler.Logan;
import packageassignments.third.com.automobile.twowheeler.Hero;
import packageassignments.third.com.automobile.twowheeler.Honda;

public class Test {
  public static void main(String[] args) {
    Hero obj1 = new Hero();
    System.out.println("Model No = " + obj1.getModelName());
    System.out.println("Owner Name = "+ obj1.getOwnerName());
    System.out.println("Registration No =" + obj1.getRegistrationNumber());
    System.out.println("Speed = " +obj1.getSpeed());
    System.out.print("Radio = " );
    obj1.radio();

    System.out.println("==================");

    Honda obj2 = new Honda();
    System.out.println("Model No = " + obj2.getModelName());
    System.out.println("Owner Name = "+ obj2.getOwnerName());
    System.out.println("Registration No =" + obj2.getRegistrationNumber());
    System.out.println("Speed = " +obj2.getSpeed());
    System.out.print("CD Player = " );
    obj2.cdPlayer();

    System.out.println("==================");

    Ford obj3 = new Ford();
    System.out.println("Model No = " + obj3.getModelName());
    System.out.println("Owner Name = "+ obj3.getOwnerName());
    System.out.println("Registration No =" + obj3.getRegistrationNumber());
    System.out.println("Speed = " +obj3.speed());
    System.out.print("Temp control = " );
    System.out.println(obj3.tempcontrol());

    System.out.println("==================");

    Logan obj4 = new Logan();
    System.out.println("Model No = " + obj4.getModelName());
    System.out.println("Owner Name = "+ obj4.getOwnerName());
    System.out.println("Registration No =" + obj4.getRegistrationNumber());
    System.out.println("Speed = " +obj4.speed());
    System.out.print("GPS = " );
    System.out.print(obj4.gps());

  }
}
