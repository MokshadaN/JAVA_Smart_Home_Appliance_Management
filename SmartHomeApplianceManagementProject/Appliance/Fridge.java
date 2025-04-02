package Appliance;

import java.util.Scanner;

public class Fridge extends Appliance {
    private String temperature;
    private String freezerTemp;

    public Fridge(boolean power, String temperature, String freezerTemp) {
        if (power) {
            on();
        } else {
            off();
        }
        this.temperature = temperature;
        this.freezerTemp = freezerTemp;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        System.out.println("Fridge temperature set to: " + temperature);
    }

    public void setFreezerTemperature(String freezerTemp) {
        this.freezerTemp = freezerTemp;
        System.out.println("Freezer temperature set to: " + freezerTemp);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Fridge Temperature");
        System.out.println("3. Change Freezer Temperature");
    }

    public void modifyAttributes(Scanner sc) {
        showOptions();
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                if (power) off(); else on();
                break;
            case 2:
                System.out.print("Enter new fridge temperature: ");
                String newTemp = sc.nextLine();
                setTemperature(newTemp);
                break;
            case 3:
                System.out.print("Enter new freezer temperature: ");
                String newFreezerTemp = sc.nextLine();
                setFreezerTemperature(newFreezerTemp);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }
    public String toString() {
        return "Fridge {" +
                "Power: " + (power ? "ON" : "OFF") +
                ", Fridge Temperature: " + temperature +
                ", Freezer Temperature: " + freezerTemp +
                "}";
    }
}
