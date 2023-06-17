package modelo.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Toyota")
public class Toyota extends Car {

  @Column
  public String directionSide;

  public Toyota(String model, Integer manufactureYear, Double mileage, String motorType, String directionSide) {
    super(model, manufactureYear, mileage, motorType);
    this.directionSide = directionSide;
  }

  public String getDirectionSide() {
    return directionSide;
  }

  public void setDirectionSide(String directionSide) {
    this.directionSide = directionSide;
  }

  
  
}
