package modelo.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Brand", length=15, discriminatorType = DiscriminatorType.STRING)
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long carId;

  @Column(nullable = false)
  private String model;

  @Column(nullable = false)
  private Integer manufactureYear;

  @Column(nullable = false)
  private Double mileage;

  @Column(nullable = false)
  private String motorType;

  public Car(String model, Integer manufactureYear, Double mileage, String motorType) {
    this.model = model;
    this.manufactureYear = manufactureYear;
    this.mileage = mileage;
    this.motorType = motorType;
  }

  public Long getCarId() {
    return carId;
  }

  public void setCarId(Long carId) {
    this.carId = carId;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Integer getManufactureYear() {
    return manufactureYear;
  }

  public void setManufactureYear(Integer manufactureYear) {
    this.manufactureYear = manufactureYear;
  }

  public Double getMileage() {
    return mileage;
  }

  public void setMileage(Double mileage) {
    this.mileage = mileage;
  }

  public String getMotorType() {
    return motorType;
  }

  public void setMotorType(String motorType) {
    this.motorType = motorType;
  }

}
