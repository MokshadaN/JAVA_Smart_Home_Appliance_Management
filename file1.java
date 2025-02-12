package project

class WaterPurifier extends Appliance{
    String water_quality = "medium";
    boolean replacement_status = "false"; 
    WaterPurifier(boolean power,String quality, boolean Replacement_status){
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
