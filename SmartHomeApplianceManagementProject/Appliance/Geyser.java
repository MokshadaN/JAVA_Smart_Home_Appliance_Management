package Appliance;

import java.util.Scanner;

public class Geyser extends Appliance {
    public double temperature;
    public String mode;

    public Geyser(boolean power, double temperature, String mode) {
        if (power) on(); else off();
        this.temperature = temperature;
        this.mode = mode;
    }

    public void setTemperature(double temp) {
        if (temp < 20 || temp > 75) {
            System.out.println("Temperature must be between 20°C and 75°C.");
        } else {
            this.temperature = temp;
            System.out.println("Temperature set to: " + temp + "°C");
        }
    }

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println("Geyser mode set to: " + mode);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Set Temperature");
        System.out.println("3. Change Mode");
    }

    public void modifyAttributes(Scanner sc) {
        showOptions();
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1:
                if (this.power) off(); else on();
                break;
            case 2:
                System.out.print("Enter temperature (20°C to 75°C): ");
                double temp = sc.nextDouble();
                setTemperature(temp);
                break;
            case 3:
                System.out.print("Enter mode (e.g., Eco, Normal, Boost): ");
                String newMode = sc.nextLine();
                setMode(newMode);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "Geyser [Power=" + (power ? "ON" : "OFF") +
               ", Temperature=" + temperature + "°C" +
               ", Mode=" + mode + "]";
    }
}
