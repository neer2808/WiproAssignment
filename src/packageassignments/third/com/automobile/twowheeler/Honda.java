package packageassignments.third.com.automobile.twowheeler;

import packageassignments.third.com.automobile.Vehicle;

public class Honda extends Vehicle {
  @Override
  public String getModelName() {
    return "2022aaaa";
  }
  @Override
  public String getRegistrationNumber() {
    return "PB888888";
  }
  @Override
  public String getOwnerName() {
    return "Dhairya";
  }
  public int getSpeed()
  {
    return 90;
  }
  public void cdPlayer()
  {
    System.out.println("control cd player device");
  }
}
