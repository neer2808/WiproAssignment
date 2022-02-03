package packageassignments.third.com.automobile.FourWheeler;

import packageassignments.third.com.automobile.Vehicle;

public class Ford extends Vehicle {
  @Override
  public String getModelName() {
    return "ABC20226789";
  }

  @Override
  public String getRegistrationNumber() {
    return "MB7777";
  }

  @Override
  public String getOwnerName() {
    return "Kamal";
  }
  public int speed()
  {
    return 40;
  }
  public int tempcontrol()
  {
    return 9;
  }
}
