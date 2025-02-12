package project

class WaterPurifier extends Appliance{
    String water_quality = "medium";
    String replacement_status = "NO"; 
    WaterPurifier(boolean power,String quality, String Replacement_status){
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
    public String FilterStatus(){
      return this.replacement_status;
    }
}
