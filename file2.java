package project

class Chimney extends Appliance{
  String speed;
  boolean light_status;
  public Chimney(boolean power, String speed, boolean light_status){
    if(power){
      on();
    }else{
      off();
    }

    this.speed = "low";
    this. light_status= " false";
  }
  public void setFanSpeed(String speed){
    this.speed =speed;
  }
   public void turnOnLight(boolean light_status){
    this.light_status="true";
  }
    public void turnOffLight(boolean light_status){
    this.light_status="false";
  }
}
  
