package Appliance;

import java.util.Scanner;

public class Printer extends Appliance {

    public Printer(boolean power) {
        if (power) on(); else off();
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
    }

    public void modifyAttributes(Scanner sc) {
        showOptions();
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                if (this.power) off(); else on();
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "Printer [Power=" + (power ? "ON" : "OFF") + "]";
    }
}
