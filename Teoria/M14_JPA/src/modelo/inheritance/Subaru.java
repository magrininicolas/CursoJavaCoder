package modelo.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Subaru")
public class Subaru extends Car {

  private String color;

  public Subaru(String model, Integer manufactureYear, Double mileage, String motorType, String color) {
    super(model, manufactureYear, mileage, motorType);
    this.color = color;

  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
