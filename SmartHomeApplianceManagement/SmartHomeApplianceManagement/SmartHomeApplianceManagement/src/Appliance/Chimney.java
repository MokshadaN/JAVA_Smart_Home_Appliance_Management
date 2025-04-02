package Appliance;

import java.util.Scanner;

public class Chimney extends Appliance {
    private String speed;
    private boolean lightStatus;

    public Chimney(boolean power, String speed, boolean lightStatus) {
        if (power) {
            on();
        } else {
            off();
        }
        this.speed = speed;
        this.lightStatus = lightStatus;
    }

    public void setFanSpeed(String speed) {
        this.speed = speed;
        System.out.println("Fan speed set to " + speed);
    }

    public void turnOnLight() {
        this.lightStatus = true;
        System.out.println("Light turned on");
    }

    public void turnOffLight() {
        this.lightStatus = false;
        System.out.println("Light turned off");
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Fan Speed");
        System.out.println("3. Turn On Light");
        System.out.println("4. Turn Off Light");
    }

    public void modifyAttributes(Scanner sc) {
        showOptions();
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (power) off(); else on();
                break;
            case 2:
                System.out.print("Enter new fan speed: ");
                String newSpeed = sc.next();
                setFanSpeed(newSpeed);
                break;
            case 3:
                turnOnLight();
                break;
            case 4:
                turnOffLight();
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    public String toString() {
        return "Chimney {" +
                "Power: " + (power ? "ON" : "OFF") +
                ", Fan Speed: " + speed +
                ", Light Status: " + (lightStatus ? "ON" : "OFF") + "}" ;
    }
}
