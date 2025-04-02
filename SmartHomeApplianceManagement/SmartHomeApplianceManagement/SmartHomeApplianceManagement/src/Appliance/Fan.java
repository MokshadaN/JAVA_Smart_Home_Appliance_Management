package Appliance;

import java.util.Scanner;

public class Fan extends Appliance {
    public double speed;

    public Fan(boolean power, double speed) {
        if (power) on(); else off();
        this.speed = speed;
    }

    public void adjustSpeed(double value) {
        this.speed = value;
        System.out.println("Speed set to " + value);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change speed");
    }

    //@Override
    public void modifyAttributes(Scanner sc) {
        showOptions();

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                if (power) off(); else on();
            }
            case 2 -> {
                System.out.print("Enter new speed value: ");
                double newSpeed = sc.nextDouble();
                adjustSpeed(newSpeed);
            }
            default -> System.out.println("Invalid option. Try again.");
        }
    }
    @Override
    public String toString() {
        return "Fan [Power: " + (power ? "ON" : "OFF") + ", Speed: " + speed + "]";
    }
}
