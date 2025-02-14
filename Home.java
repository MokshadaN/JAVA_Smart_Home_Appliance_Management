  
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
      public int volume;
      public Speaker(boolean power,int volume){
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
      Mircowave(boolean power, String powerlvl, int cooking_time, String mode){
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
      VacuumCleaner(boolean power, String clean_mode, int bat){
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
      public void checkBatteryStatus(){

          System.out.println(this.battery_status);
      }
  }
  
  
  class Chimney extends Appliance{
      String speed;
      boolean light_status;
      Chimney(boolean power, String speed, boolean light_status){
        if(power){
          on();
        }else{
          off();
        }
    
        this.speed = speed;
        this.light_status= light_status;
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
  
  public class Home{
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
