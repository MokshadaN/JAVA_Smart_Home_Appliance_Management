package Appliance;

import java.util.Scanner;

public class Light extends Appliance {
    public double brightness;
    public String colorTemperature;

    public Light(boolean power, double brightness, String colorTemperature) {
        if (power) on(); else off();
        this.brightness = brightness;
        this.colorTemperature = colorTemperature;
    }

    public void adjustBrightness(double value) {
        this.brightness = value;
        System.out.println("Brightness set to " + value);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Brightness");
        System.out.println("3. Change Color Temperature");
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
                System.out.print("Enter new brightness value: ");
                double newBrightness = sc.nextDouble();
                adjustBrightness(newBrightness);
            }
            case 3 -> {
                System.out.print("Enter new color temperature (e.g., Warm, Cool White): ");
                sc.nextLine(); // Consume newline
                String newColorTemp = sc.nextLine();
                this.colorTemperature = newColorTemp;
                System.out.println("Color temperature changed to " + newColorTemp);
            }
            default -> System.out.println("Invalid option. Try again.");
        }
    }
    @Override
    public String toString() {
        return "Light [Power: " + (power ? "ON" : "OFF") +
               ", Brightness: " + brightness +
               ", Color Temperature: " + colorTemperature + "]";
    }
}
