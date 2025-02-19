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

class WaterPurifier extends Appliance{
    String water_quality = "medium";
    boolean replacement_status = "false"; 
    public WaterPurifier(boolean power,String quality, boolean Replacement_status){
      if(power){
        on();
      }else{
        off();
      }
      this.water_quality = quality;
      this.replacement_status = Replacement_status;     
      
    }
    public String CheckWaterQuality(){
      return this.water_quality;
    }
    public boolean FilterStatus(){
      return this.replacement_status;
    }
    public void replacefilter(){
        this.replacement_status = "true";
        return;
    }
}


class Mircowave extends Appliance{
    String PowerLevel;
    int cooking_time;
    String Mode;
    public Microwave(boolean power, String powerlvl, int cooking_time, String mode){
        if(power){
            on();
          }else{
            off();
          }
        this.PowerLevel = powerlvl;
        this.cooking_time = cooking_time;
        this.Mode = mode;
    }
    public void SetPowerLevel(String level){
        this.PowerLevel = level;
        return;
    }
    public void SetCookingTime(int minutes){
        this.cooking_time = minutes;
    }
    public void setMode(String mode){
        this.Mode = mode;
    }    
}


class VacuumCleaner extends Appliance{
    String cleaning_mode;
    int battery_status;
    public VacuumCleaner(boolean power, String clean_mode, int bat){
        if(power){
            on();
          }else{
            off();
          }
        this.cleaning_mode = clean_mode;
        this.battery_status = bat;
    }
    public void setCleaningMode(String mode){
        this.cleaning_mode = mode
    }
    public int checkBatteryStatus(){
        return this.battery_status
    }
}



class Dishwasher extends Appliance{
    String Washcycle;
    String Watertemp;
    Dishwasher(boolean power, String Washcycle, String temp){
        if(power){
            on();
        }
        else{
            off();
        }
        this.Washcycle = Washcycle;
        this.Watertemp = temp;
    }
    public void setWashCycle(String cycle){
        this.Washcycle = cycle;
    }
    public void setWaterTemperature(String Temp){
        this.Watertemp = Temp;
    }
}

class Mixer extends Appliance{
    String speed;
    Mixer(boolean power, String speed){
        if(power){
            on();
        }
        else{
            off();
        }
        this.speed= speed;
    }
    public void setSpeed(String speed_val){
        this.speed = speed_val;
    }
}

class Fridge extends Appliance{
    String temperature;
    String freezer_temp;
    Fridge(boolean power, String temp_val, String freezer){
        
        if(power){
            on();
        }
        else{
            off();
        }
        this.temperature = temp;
        this.freezer_temp = freezer;
    }
    public void setTemperature(String temp){
        this.temperature = temp;
    }
    public void setFreezerTemperature(String temp){
        this.freezer_temp = temp;
    }
    
}
  
