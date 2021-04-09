package org.example.model.car;

public enum Brand {

  BMW("BMW"),
  AUDI("Audi"),
  VOLKSWAGEN("Volkswagen"),
  SKODA("Skoda"),
  RENAULT("Renault");

  private String name;

  Brand(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Brand{");
    sb.append("name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
