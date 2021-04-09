package org.example.model.car_park;

import java.util.ArrayList;
import java.util.List;
import org.example.model.car.PassengerCar;

public class TaxiPark implements CarPark {

  public static List<PassengerCar> taxiParkCars = new ArrayList<>();

  public void addCar(PassengerCar car) {
  }

  @Override
  public void carParkCost() {
  }

}
