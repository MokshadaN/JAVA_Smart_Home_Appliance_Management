package Home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Appliance.Fan;
import Appliance.Light;
import Appliance.Microwave;
import Appliance.WaterPurifier;
import Appliance.Mixer;
import Appliance.Dishwasher;
import Appliance.Appliance;
import Appliance.Chimney;
import Appliance.Fridge;

public class Kitchen extends MyHome {
    private Map<String, Appliance> kitchenAppliances = new HashMap<>();
    
    public Kitchen(String name) {
        super(name);
    
        kitchenAppliances.put("Microwave", new Microwave(false, "Low", 40, "Convection"));
        kitchenAppliances.put("Dishwasher", new Dishwasher(false, "normal", "cold"));
        kitchenAppliances.put("Mixer", new Mixer(false, "LOW"));
        kitchenAppliances.put("Water Purifier", new WaterPurifier(false, "medium", false));
        kitchenAppliances.put("Chimney", new Chimney(false, "low", false));
        kitchenAppliances.put("Light", new Light(false, 95, "cool white"));
        kitchenAppliances.put("Fan", new Fan(false, 1));
        kitchenAppliances.put("Fridge", new Fridge(true, "medium", "low"));
    }
    
    public void manageAppliances(Scanner sc){
        while(true){

            List<String> applianceNames = new ArrayList<>(kitchenAppliances.keySet());
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
            System.out.println(kitchenAppliances.get(appli));
            kitchenAppliances.get(appli).modifyAttributes(sc);
        }
    };
}
