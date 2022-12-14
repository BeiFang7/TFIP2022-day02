package main;

import java.util.Date;

//import the Car package that we make earlier
import models.Car;
import models.TurboChargedCar;

public class Main {
  public static void main(String[] args){

    //to instantiate a copy of the mycar (object) from a class (Car)
    Car myCar = new Car("SAA1234A");
    Car myOtherCar = new TurboChargedCar("TAA1234A");
    Date date = new Date();

    myCar.setColour("red");
    myCar.setMake("Honda");
    myCar.setRegistration("SAA1234A");
    myCar.setRegistrationDate(date); // myCar.setRegistrationDate (new date()); also can


    myCar.horn();
    System.out.printf("colour: %s, make: %s, registration: %s\n", myCar.getColour(),myCar.getMake(),myCar.getRegistration());

    myCar.accelerate();
    myCar.accelerate();
    myCar.accelerate();

    //cannot do Car.acceleration --> cannot apply accelerate to the classes, can only apply to object

    System.out.printf("acceleration: %d\n", myCar.getAcceleration());

    if (myOtherCar instanceof TurboChargedCar){
      //Cast into a TurboChargedCar type
      TurboChargedCar turbo = (TurboChargedCar)myOtherCar;
      turbo.setTurbo(true);
    }

  }
  
}
