package models;

import java.util.Date;

public class Car{

  //Properties - a.k.a. members
  private String colour;
  private String make;
  private String registration;
  private Date registrationDate;
  private Integer acceleration = 0; // need to initialise

  //Access methods to our members
  //getMemberName, setMemberName

  //When you add in a constructor, the default constructor disappears
  public Car(String registration){
   this.registration = registration;
  } //if you add in this, when you make a new Car in Main, need to key in the registration number. If you want to program such that once you buy a car cannot change the registration number, then you remove the setRegistration in the Car class.

  public Car(String registration, String colour){
    this.registration = registration;
    this.colour = colour;
  }

  public Car(String registration, String colour, String make){
    this.registration = registration;
    this.colour = colour;
    this.make = make;
  }

  //visibility tool - Method or Procedure 
  public String getColour(){
    //Gives a lot of leverage such that you only get the colour in uppercase, even though i may save it as lowercase in private.
    return this.colour.toUpperCase();
  }

  //when not returning anything, use void
  //set this.colour from getColour as colour that is defined in the method.
  public void setColour(String colour){
    this.colour = colour;
  }
  /*
  //this means the function is finding colour in the function, if cannot that 
  public void setColour(){
    this.colour = colour
  }
   */

  //make - getter and setter for the members (special method, recognise is a property, with property names like colour)
  public String getMake(){
   return this.make;
  }
  public void setMake(String make){
    this.make = make;
  }

  //only set Honda, Toyota and Musta
  public String getmake(){
    return this.make;
  }
  public void setmake(String make){
    switch (make.toLowerCase()) {
      // if (make.equals("honda")||(make.equals("toyota") || make.equals("mazda")), set this.make = make
      case "honda":
      case "toyota":
      case "mazda":
        this.make = make;
        break;
      default:
    }
  }

  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }

  public Date getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(Date registrationDate) {
    this.registrationDate = registrationDate;
  }

  //get acceleration only, cannot change, no set
  public Integer getAcceleration(){
    return this.acceleration;
  }

  //Behaviour - method
  public void horn(){
    System.out.println("horn horn horn");
  }

  //if i just call accelerate (), will perform this accelerate method.
  public void accelerate() {
    if (this.acceleration < 200)
      this.acceleration++;
  } 

  //if i call accelerate (x), will perform the accelerate method x times.
  public void accelerate (Integer n){
    for (Integer i=0;i<n;i++)
    this.accelerate();
  }

  public void decelerate(){
    if (this.acceleration > 0)
      acceleration--;
  }

}