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
