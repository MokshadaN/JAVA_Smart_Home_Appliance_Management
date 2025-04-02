package Home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Appliance.Fan;
import Appliance.Light;
import Appliance.WaterPurifier;
import Appliance.Appliance;

public class Bathroom extends MyHome {
    Light bathroomLight = new Light(false, 75, "warm white");
    Fan bathroomExhaustFan = new Fan(false, 2);
    WaterPurifier showerFilter = new WaterPurifier(false, "high", false);

    private Map<String, Appliance> bathroomAppliances = new HashMap<>();

    public Bathroom(String name) {
        super(name);

        bathroomAppliances.put("Light", new Light(false, 75, "warm white"));
        bathroomAppliances.put("Exhaust Fan", new Fan(false, 2));
        bathroomAppliances.put("Shower Filter", new WaterPurifier(false, "high", false));
    }

    public void manageAppliances(Scanner sc) {
        while (true) {
            List<String> applianceNames = new ArrayList<>(bathroomAppliances.keySet());
            for (int i = 0; i < applianceNames.size(); i++) {
                System.out.println((i + 1) + ". " + applianceNames.get(i));
            }
            System.out.println((applianceNames.size() + 1) + ". Exit");

            System.out.print("Choose an appliance: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == applianceNames.size() + 1) {
                break;
            }
            String selectedAppliance = applianceNames.get(choice - 1);
            System.out.println(bathroomAppliances.get(selectedAppliance));
            bathroomAppliances.get(selectedAppliance).modifyAttributes(sc);
        }
    }
}