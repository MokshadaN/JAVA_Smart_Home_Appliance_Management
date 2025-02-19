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
class Light extends Appliance{
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
    this.temperature = temperature;
  }
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
    this. light_status= false;
  }
  public void setFanSpeed(String speed){
    this.speed =speed;
  }
   public void turnOnLight(boolean light_status){
    this.light_status=true;
  }
    public void turnOffLight(boolean light_status){
    this.light_status=false;
  }
}
class WaterPurifier extends Appliance{
    String water_quality = "medium";
    boolean replacement_status = false; 
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
        this.replacement_status = true;
        return;
    }
}


class Mircowave extends Appliance{
    String PowerLevel;
    int cooking_time;
    String Mode;
    Microwave(boolean power, String powerlvl, int cooking_time, String mode){
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
        this.cleaning_mode = mode;
    }
    public int checkBatteryStatus(){
        return this.battery_status;
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
        this.temperature = temp_val;
        this.freezer_temp = freezer;
    }
    public void setTemperature(String temp){
        this.temperature = temp;
    }
    public void setFreezerTemperature(String temp){
        this.freezer_temp = temp;
    }
    
}



class MyHome{
  String name;
  MyHome(String name_val){
    this.name = name_val;
  }
}

class Hall extends MyHome{
    Light hall_light_1 = new Light(false,93.2,"cool white");
    Fan hall_fan = new Fan(false,1);
    AC hall_ac = new AC(false,18,"cool");
    TV hall_tv = new TV(false,33);
    VacuumCleaner hall_vacuumcleaner = new VacuumCleaner(false, name, 78);
    Hall(String name_val){
        super(name_val);
    }
    public void display(){
        System.out.println(hall_light_1.brightness);
        System.out.println(hall_fan.speed);
        System.out.println(hall_ac.temperature);
        System.out.println(hall_tv.volume);

    }
}

class Bedroom extends MyHome{
  Light room_light_1 = new Light(false,93.2,"cool white");
  Light room_light_2 = new Light(false,93.2,"cool white");
  Light room_light_3 = new Light(false,93.2,"cool white");
  Fan room_fan = new Fan(false,1);
  AC room_ac = new AC(false,18,"cool");
  TV room_tv = new TV(false,33);
  Iron room_iron= new Iron(false,78.5);
  Printer room_printer = new Printer(false);
  Computer room_computer = new Computer(false);
    
      Bedroom(String name_val){
          super(name_val);
      }
      public void display(){
          System.out.println(room_light_1.brightness);
          System.out.println(room_light_2.brightness);
          System.out.println(room_light_3.brightness);
          System.out.println(room_fan.speed);
          System.out.println(room_ac.temperature);
          System.out.println(room_tv.volume);
  
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

public class HOME{
  public static void main(String[] args){
    Hall hall = new Hall("MyHome");
    hall.display();
    hall.hall_vacuumcleaner.checkBatteryStatus();
    System.out.println(hall.hall_vacuumcleaner.power);
    hall.hall_vacuumcleaner.on();
    System.out.println(hall.hall_vacuumcleaner.power);
    hall.hall_vacuumcleaner.off();
    System.out.println(hall.hall_vacuumcleaner.power);
  }
}
