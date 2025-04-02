package Appliance;

import java.util.Scanner;

public class VacuumCleaner extends Appliance {
    String cleaning_mode;
    int battery_status;

    public VacuumCleaner(boolean power, String cleaning_mode, int battery_status) {
        if (power) on(); else off();
        this.cleaning_mode = cleaning_mode;
        this.battery_status = Math.max(0, Math.min(100, battery_status)); // Clamp between 0–100
    }

    public void setCleaningMode(String mode) {
        this.cleaning_mode = mode;
        System.out.println("Cleaning mode set to: " + mode);
    }

    public void setBatteryStatus(int status) {
        if (status < 0 || status > 100) {
            System.out.println("Battery status must be between 0 and 100.");
        } else {
            this.battery_status = status;
            System.out.println("Battery status updated to: " + status + "%");
        }
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Cleaning Mode");
        System.out.println("3. Update Battery Status");
    }

    public void modifyAttributes(Scanner sc) {
        showOptions();
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        switch (choice) {
            case 1:
                if (this.power) off(); else on();
                break;
            case 2:
                System.out.print("Enter new cleaning mode (e.g., Eco, Standard, Turbo): ");
                String mode = sc.nextLine();
                setCleaningMode(mode);
                break;
            case 3:
                System.out.print("Enter battery percentage (0–100): ");
                int battery = sc.nextInt();
                setBatteryStatus(battery);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "VacuumCleaner [Power=" + (power ? "ON" : "OFF") +
               ", Cleaning Mode=" + cleaning_mode +
               ", Battery Status=" + battery_status + "%]";
    }
}
