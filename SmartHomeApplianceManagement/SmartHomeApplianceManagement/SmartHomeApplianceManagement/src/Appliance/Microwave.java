package Appliance;

import java.util.Scanner;

public class Microwave extends Appliance {
    String powerLevel;
    int cooking_time;
    String mode;

    public Microwave(boolean power, String powerLevel, int cooking_time, String mode) {
        if (power) on(); else off();
        this.powerLevel = powerLevel;
        this.cooking_time = cooking_time;
        this.mode = mode;
    }

    public void setPowerLevel(String level) {
        this.powerLevel = level;
        System.out.println("Power level set to: " + level);
    }

    public void setCookingTime(int time) {
        if (time < 0) {
            System.out.println("Cooking time cannot be negative.");
        } else {
            this.cooking_time = time;
            System.out.println("Cooking time set to: " + time + " seconds");
        }
    }

    public void setMode(String newMode) {
        this.mode = newMode;
        System.out.println("Cooking mode set to: " + newMode);
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Power Level");
        System.out.println("3. Set Cooking Time");
        System.out.println("4. Change Mode");
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
                System.out.print("Enter power level (e.g., Low, Medium, High): ");
                String level = sc.nextLine();
                setPowerLevel(level);
                break;
            case 3:
                System.out.print("Enter cooking time (in seconds): ");
                int time = sc.nextInt();
                setCookingTime(time);
                break;
            case 4:
                System.out.print("Enter cooking mode (e.g., Grill, Bake, Reheat): ");
                String newMode = sc.nextLine();
                setMode(newMode);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "Microwave [Power=" + (power ? "ON" : "OFF") +
               ", Power Level=" + powerLevel +
               ", Cooking Time=" + cooking_time + "s" +
               ", Mode=" + mode + "]";
    }
}
