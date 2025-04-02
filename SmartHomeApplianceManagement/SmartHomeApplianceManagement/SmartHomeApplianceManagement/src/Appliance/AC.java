package Appliance;

import java.util.Scanner;

public class AC extends Appliance {
    public double temperature;
    public String mode;

    public AC(boolean power, double temperature, String mode) {
        if (power) on(); else off();
        this.temperature = temperature;
        this.mode = mode;
    }

    public void adjustTemperature(double value) {
        this.temperature = value;
        System.out.println("Temperature set to " + value);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Temperature");
        System.out.println("3. Change Mode");
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
                System.out.print("Enter new temperature value: ");
                double newTemperature = sc.nextDouble();
                adjustTemperature(newTemperature);
            }
            case 3 -> {
                System.out.print("Enter new mode (e.g.,Cool, Dry): ");
                sc.nextLine(); 
                String newMode = sc.nextLine();
                this.mode = newMode;
                System.out.println("Mode changed to " + newMode);
            }
            default -> System.out.println("Invalid option. Try again.");
        }
    }
    @Override
    public String toString() {
        return "AC is currently " + (power ? "ON" : "OFF") +
            ", Temperature: " + temperature + "°C" +
            ", Mode: " + mode;
    }

}
