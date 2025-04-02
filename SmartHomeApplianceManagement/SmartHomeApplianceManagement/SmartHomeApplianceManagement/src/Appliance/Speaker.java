package Appliance;

import java.util.Scanner;

public class Speaker extends Appliance {
    public int volume;

    public Speaker(boolean power, int volume) {
        if (power) on(); else off();
        this.volume = Math.max(0, Math.min(100, volume)); // Clamp volume between 0–100
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0 || newVolume > 100) {
            System.out.println("Volume must be between 0 and 100.");
        } else {
            this.volume = newVolume;
            System.out.println("Volume set to: " + newVolume);
        }
    }

    public void showOptions() {
        System.out.println("1. Toggle Power (ON/OFF)");
        System.out.println("2. Change Volume");
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
                System.out.print("Enter new volume (0–100): ");
                int newVolume = sc.nextInt();
                setVolume(newVolume);
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
    }

    @Override
    public String toString() {
        return "Speaker [Power=" + (power ? "ON" : "OFF") +
               ", Volume=" + volume + "]";
    }
}
