import Home.MyHome;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Home's name: ");
        String homeName = sc.nextLine();

        MyHome home = new MyHome(homeName);

        while (true) {
            System.out.println("\nRoom Options: Hall, Kitchen, Bedroom1, Bedroom2, Bathroom");
            System.out.println("Enter the room you want to access or type 'exit' to stop:");

            String roomChoice = sc.nextLine().trim().toLowerCase();
            if (roomChoice.equals("exit")) {
                System.out.println("Exiting... Have a great day!");
                break;
            }

            home.enterRoom(roomChoice,sc);
        }
    }
}
