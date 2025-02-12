class Appliance{
  public boolean power = false;
  public void on(){
    power = true;
  }
  public void off(){
    power = false;
  }
}

class Fan extends Appliance{
  public double speed;
  public Fan(boolean power,double speed){
    if(power){
      on();
    }else{
      off();
    }

    this.speed = speed;
  }
}
  
  
