package Appliance;

import java.util.Scanner;

public class Iron extends Appliance {
    public double temperature;

    public Iron(boolean power, double temperature) {
        if (power) on(); else off();
        this.temperature = temperature;
    }

    public void setTemperature(double temp) {
        if (temp < 0 || temp > 300) {
            System.out.println("Invalid temperature. Please enter a value between 0 and 300°C.");
        } else {
            this.temperature = temp;
            System.out.println("Temperature set to: " + temp + "°C");
        }
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Set Temperature");
    }

    public void modifyAttributes(Scanner sc) {
        showOptions();
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (this.power) off(); else on();
                break;
            case 2:
                System.out.print("Enter new temperature (°C): ");
                double temp = sc.nextDouble();
                setTemperature(temp);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "Iron [Power=" + (power ? "ON" : "OFF") +
               ", Temperature=" + temperature + "°C]";
    }
}
