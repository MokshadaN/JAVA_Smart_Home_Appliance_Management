package Appliance;

import java.util.Scanner;

public abstract class Appliance {  // Abstract class
    public boolean power = false;
 
    public void on() {
        power = true;
        System.out.println(getClass().getSimpleName() + " is now ON.");
    }

    public void off() {
        power = false;
        System.out.println(getClass().getSimpleName() + " is now OFF.");
    }

    // Abstract method for dynamic attribute modification
    public abstract void modifyAttributes(Scanner sc);
}
