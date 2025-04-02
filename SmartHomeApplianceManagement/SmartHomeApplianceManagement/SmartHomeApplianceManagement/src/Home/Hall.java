package Home;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Appliance.AC;
import Appliance.Appliance;
import Appliance.Fan;
import Appliance.Light;
import Appliance.TV;
import Appliance.VacuumCleaner;

public class Hall extends MyHome {
    private Map<String, Appliance> hallAppliances = new LinkedHashMap<>();

    public Hall(String name) {
        super(name);
        hallAppliances.put("Light", new Light(false, 93.2, "cool white"));
        hallAppliances.put("Fan", new Fan(false, 1));
        hallAppliances.put("AC", new AC(false, 18, "cool"));
        hallAppliances.put("TV", new TV(false, 33));
        hallAppliances.put("Vacuum Cleaner", new VacuumCleaner(false, "normal", 78));
    }
    public void manageAppliances(Scanner sc) {
        while(true){

            List<String> applianceNames = new ArrayList<>(hallAppliances.keySet());
            for (int i = 0; i < applianceNames.size(); i++) {
                System.out.println((i + 1) + ". " + applianceNames.get(i));
            }
            System.out.println((applianceNames.size() + 1) + ". Exit");
            
            System.out.println("Choose an appliance: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == applianceNames.size() + 1){
                break;
            }
            String appli = applianceNames.get(choice-1);
            System.out.println(hallAppliances.get(appli));
            hallAppliances.get(appli).modifyAttributes(sc);
        }
    }
}
