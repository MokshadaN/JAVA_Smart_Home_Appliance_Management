package project
class HOME{
  String name;
  HOME(String name_val){
    this.name = name_val;
  }
}

class Hall extend HOME{
    Light hall_light_1 = new Light(false,93.2,"cool white");
    Fan hall_fan = new Fan(false,1);
    AC hall_ac = new AC(false,18,"cool");
    TV hall_tv = new TV(false,33);
  
}

public class HOME{
  public static void main(String[] args){
    System.out.println("Hello")
  }
}
