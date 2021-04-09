package org.example.model.car;

import java.util.Objects;

public abstract class Car {

  private String brand;
  private String model;
  private double fuelConsumption;
  private double speedLimit;
  private double price;

  public Car() {
  }

  public Car(String brand, String model, double fuelConsumption, double speedLimit, double price) {
    this.brand = brand;
    this.model = model;
    this.fuelConsumption = fuelConsumption;
    this.speedLimit = speedLimit;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public double getFuelConsumption() {
    return fuelConsumption;
  }

  public double getSpeedLimit() {
    return speedLimit;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Double.compare(car.fuelConsumption, fuelConsumption) == 0
        && Double.compare(car.speedLimit, speedLimit) == 0
        && Double.compare(car.price, price) == 0 && Objects
        .equals(brand, car.brand) && Objects.equals(model, car.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, fuelConsumption, speedLimit, price);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Car{");
    sb.append("brand='").append(brand).append('\'');
    sb.append(", model='").append(model).append('\'');
    sb.append(", fuelConsumption=").append(fuelConsumption);
    sb.append(", speedLimit=").append(speedLimit);
    sb.append(", price=").append(price);
    sb.append('}');
    return sb.toString();
  }
}
