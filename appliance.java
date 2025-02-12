package project
  
class Appliance{
  public boolean power = false;
  public void on(){
    power = true;
  }
  public void off(){
    power = false;
  }
}
//fan
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

//light
class Ligtht extends Appliance{
  public double brightness;
  public String colorTemperature;
  public Fan(boolean power,double brightness,String colorTemperature){
    if(power){
      on();
    }else{
      off();
    }

    this.brightness = brightness;
    this.colorTemperature = colorTemperature;
  }
}

//ac
class AC extends Appliance{
  public double temperature;
  public String mode;
  public Fan(boolean power,double temperature,String mode){
    if(power){
      on();
    }else{
      off();
    }

    this.temperature = temperature;
    this.mode = mode;
  }
}
//tv
//iron
//printer
//comp
  
  
