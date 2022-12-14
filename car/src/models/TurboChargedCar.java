package models;

public class TurboChargedCar extends Car{ //inheritance
  
  private Boolean turbo = false;
  
  //when you inherit from the parent Class, need to follow the same constructor.
  public TurboChargedCar (String registration){
    //must be the first line
    super(registration);
  }

  public Boolean getTurbo() {
    return turbo;
  }

  public void setTurbo(Boolean turbo) {
    this.turbo = turbo;
  }

  //override parent file (Car) accelerate
  @Override
  public void accelerate(){
    if (this.turbo){
      super.accelerate();
      super.accelerate();
      super.accelerate();
      super.accelerate();
      super.accelerate();
      System.out.println("Vroooommmmmm!");
    } else {
      super.accelerate();
      System.out.println("Pfttt...");
    }
  }



}
