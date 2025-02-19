package project

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


class Kitchen extends MyHome{
    Microwave microwave_1 = new Microwave(false, "Low", 40, "Convection");
    Dishwasher dishwasher_1 = new Dishwasher(false,"normal","cold");
    Mixer mixer_1 = new Mixer(false, "LOW");
    WaterPurifier RO = new  WaterPurifier(false, "medium",false);
    Chimney chimney = new Chimney(false,"low",false);
    Light kitchen_light = new Light(false,95,"cool white");
    Fan kitchen_exhaust_fan = new Fan(false,1);
    Fridge fridge = new Fridge(true,"medium","low");
    
    Kitchen(String name_val){
        super(name_val);
    }
    public void display(){
        
    }
    
}
