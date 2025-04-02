package Home;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Appliance.AC;
import Appliance.Appliance;
import Appliance.Computer;
import Appliance.Fan;
import Appliance.Iron;
import Appliance.Light;
import Appliance.Printer;
import Appliance.TV;

public class Bedroom extends MyHome {
    private final Map<String, Appliance> bedroomAppliances = new LinkedHashMap<>();

    public Bedroom(String name) {
        super(name);
        bedroomAppliances.put("Light 1", new Light(false, 93.2, "cool white"));
        bedroomAppliances.put("Light 2", new Light(false, 93.2, "cool white"));
        bedroomAppliances.put("Light 3", new Light(false, 93.2, "cool white"));
        bedroomAppliances.put("Fan", new Fan(false, 1));
        bedroomAppliances.put("AC", new AC(false, 18, "cool"));
        bedroomAppliances.put("TV", new TV(false, 33));
        bedroomAppliances.put("Iron", new Iron(false, 78.5));
        bedroomAppliances.put("Printer", new Printer(false));
        bedroomAppliances.put("Computer", new Computer(false));
    }

    public void manageAppliances(Scanner sc) {
        while(true){

            List<String> applianceNames = new ArrayList<>(bedroomAppliances.keySet());
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
            System.out.println(bedroomAppliances.get(appli));
            bedroomAppliances.get(appli).modifyAttributes(sc);
        }
    }
}
