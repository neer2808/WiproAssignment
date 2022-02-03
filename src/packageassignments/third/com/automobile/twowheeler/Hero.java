package packageassignments.third.com.automobile.twowheeler;

import packageassignments.third.com.automobile.Vehicle;

public class Hero extends Vehicle {

  @Override
  public String getModelName() {
    return "ABC123456";
  }

  @Override
  public String getRegistrationNumber() {
    return "HR999999";
  }

  @Override
  public String getOwnerName() {
    return "neeraj";
  }

  public int getSpeed()
  {
    return 60;
  }
  public void radio()
  {
    System.out.println("control radio device");
  }
}
