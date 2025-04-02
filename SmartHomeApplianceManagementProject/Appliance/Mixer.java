package Appliance;

import java.util.Scanner;

public class Mixer extends Appliance {
    String speed;

    public Mixer(boolean power, String speed) {
        if (power) on(); else off();
        this.speed = speed;
    }

    public void setSpeed(String newSpeed) {
        this.speed = newSpeed;
        System.out.println("Mixer speed set to: " + newSpeed);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Speed");
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
                System.out.print("Enter speed (e.g., Low, Medium, High): ");
                String newSpeed = sc.nextLine();
                setSpeed(newSpeed);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "Mixer [Power=" + (power ? "ON" : "OFF") +
               ", Speed=" + speed + "]";
    }
}
