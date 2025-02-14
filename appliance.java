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
  public Light(boolean power,double brightness,String colorTemperature){
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
  public AC(boolean power,double temperature,String mode){
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
class TV extends Appliance{
  public int volume;
  public TV(boolean power,int volume){
    if(power){
      on();
    }else{
      off();
    }

    this.volume = volume;
  }
}
//iron
class Iron extends Appliance{
  public double temperature;
  public Iron(boolean power,double temperature){
    if(power){
      on();
    }else{
      off();
    }
  }
  this.temperature = temperature;
}

//printer
class Printer extends Appliance{
  public Printer(boolean power){
    if(power){
      on();
    }else{
      off();
    }
  }
}
//comp
class Computer extends Appliance{
  public Computer(boolean power){
    if(power){
      on();
    }else{
      off();
    }
  }
}
//speaker
class Speaker extends Appliance{
  public Speaker(boolean power,int volume){

    public int volume;
    if(power){
      on();
    }else{
      off();
    }

    this.volume = volume;
  }
}

  
