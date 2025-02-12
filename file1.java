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
