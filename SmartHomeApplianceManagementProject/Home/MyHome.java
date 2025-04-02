package Home;

import Appliance.*;
import java.util.*;

public class MyHome {
    private String name;
    private Map<String, MyHome> rooms = new HashMap<>();

    public MyHome(String name) {
        this.name = name;
    }

    public void addRoom(String roomName) {
        if (!rooms.containsKey(roomName)) {
            switch (roomName.toLowerCase()) {
                case "hall" -> rooms.put(roomName, new Hall(name));
                case "kitchen" -> rooms.put(roomName, new Kitchen(name));
                case "bedroom1" -> rooms.put(roomName, new Bedroom(name));
                case "bedroom2" -> rooms.put(roomName, new Bedroom(name));
                case "bathroom" -> rooms.put(roomName, new Bathroom(name));
                default -> System.out.println("Invalid room choice.");
            }
        }
        System.out.println(roomName + " is now accessible.");
    }

    public void enterRoom(String roomName, Scanner sc) {
        roomName = roomName.toLowerCase();
    
        if (!rooms.containsKey(roomName)) {
            System.out.println("Room not found! Creating a new room...");
            addRoom(roomName);
        }
    
        MyHome room = rooms.get(roomName);
        if (room != null) {
            System.out.println("Entering " + roomName + "...");
            room.manageAppliances(sc);
        }
    }

    public void manageAppliances(Scanner sc){
        System.out.println("Default implementation");
    };
}
