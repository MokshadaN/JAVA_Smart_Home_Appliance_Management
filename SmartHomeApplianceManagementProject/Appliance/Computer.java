package Appliance;

import java.util.Scanner;

public class Computer extends Appliance {
    private boolean isSleeping;

    public Computer(boolean power) {
        if (power) {
            on();
        } else {
            off();
        }
        this.isSleeping = false;
    }

    public void sleepMode() {
        isSleeping = true;
        System.out.println("Computer is now in sleep mode.");
    }

    public void wakeUp() {
        isSleeping = false;
        System.out.println("Computer is now awake.");
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Put in Sleep Mode");
        System.out.println("3. Wake Up");
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
                sleepMode();
                break;
            case 3:
                wakeUp();
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    public String toString() {
        return "Computer {" +
                "Power: " + (power ? "ON" : "OFF") +
                ", Sleep Mode: " + (isSleeping ? "ON" : "OFF") +
                "}";
    }
}
