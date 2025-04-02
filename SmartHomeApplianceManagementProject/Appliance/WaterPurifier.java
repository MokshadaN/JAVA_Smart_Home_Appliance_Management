package Appliance;

import java.util.Scanner;

public class WaterPurifier extends Appliance {
    public String water_quality;
    public boolean replacement_status;

    public WaterPurifier(boolean power, String quality, boolean replacement_status) {
        if (power) on(); else off();
        this.water_quality = quality;
        this.replacement_status = replacement_status;
    }

    public String checkWaterQuality() {
        return this.water_quality;
    }

    public boolean filterStatus() {
        return this.replacement_status;
    }

    public void replaceFilter() {
        this.replacement_status = true;
        System.out.println("Filter has been replaced.");
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Check Water Quality");
        System.out.println("3. Check Filter Replacement Status");
        System.out.println("4. Replace Filter");
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
                System.out.println("Current water quality: " + checkWaterQuality());
                break;
            case 3:
                System.out.println("Filter replacement needed: " + (filterStatus() ? "Yes" : "No"));
                break;
            case 4:
                replaceFilter();
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "WaterPurifier [Power=" + (power ? "ON" : "OFF") +
               ", Water Quality=" + water_quality +
               ", Filter Replacement Needed=" + (replacement_status ? "Yes" : "No") + "]";
    }
}
