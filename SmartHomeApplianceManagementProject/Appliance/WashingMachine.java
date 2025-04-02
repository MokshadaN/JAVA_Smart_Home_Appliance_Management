package Appliance;

import java.util.Scanner;

public class WashingMachine extends Appliance {
    public String washing_mode;
    public String water_temperature;

    public WashingMachine(boolean power, String washing_mode, String water_temperature) {
        if (power) on(); else off();
        this.washing_mode = washing_mode;
        this.water_temperature = water_temperature;
    }

    public void setWashingMode(String mode) {
        this.washing_mode = mode;
        System.out.println("Washing mode set to: " + mode);
    }

    public void setWaterTemperature(String temperature) {
        this.water_temperature = temperature;
        System.out.println("Water temperature set to: " + temperature);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Washing Mode");
        System.out.println("3. Change Water Temperature");
    }

    public void modifyAttributes(Scanner sc) {
        showOptions();
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                if (this.power) off(); else on();
                break;
            case 2:
                System.out.print("Enter new washing mode (e.g., Quick, Normal, Heavy): ");
                String mode = sc.nextLine();
                setWashingMode(mode);
                break;
            case 3:
                System.out.print("Enter water temperature (e.g., Cold, Warm, Hot): ");
                String temp = sc.nextLine();
                setWaterTemperature(temp);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "WashingMachine [Power=" + (power ? "ON" : "OFF") +
               ", Washing Mode=" + washing_mode +
               ", Water Temperature=" + water_temperature + "]";
    }
}
