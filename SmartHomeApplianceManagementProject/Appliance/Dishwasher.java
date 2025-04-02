package Appliance;

import java.util.Scanner;

public class Dishwasher extends Appliance {
    private String washCycle;
    private String waterTemp;

    public Dishwasher(boolean power, String washCycle, String waterTemp) {
        if (power) {
            on();
        } else {
            off();
        }
        this.washCycle = washCycle;
        this.waterTemp = waterTemp;
    }

    public void setWashCycle(String washCycle) {
        this.washCycle = washCycle;
        System.out.println("Wash cycle set to: " + washCycle);
    }

    public void setWaterTemperature(String waterTemp) {
        this.waterTemp = waterTemp;
        System.out.println("Water temperature set to: " + waterTemp);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Wash Cycle");
        System.out.println("3. Change Water Temperature");
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
                System.out.print("Enter new wash cycle: ");
                String newCycle = sc.nextLine();
                setWashCycle(newCycle);
                break;
            case 3:
                System.out.print("Enter new water temperature: ");
                String newTemp = sc.nextLine();
                setWaterTemperature(newTemp);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }
    public String toString() {
        return "Dishwasher {" +
                "Power: " + (power ? "ON" : "OFF") +
                ", Wash Cycle: " + washCycle +
                ", Water Temperature: " + waterTemp +
                "}";
    }
}
