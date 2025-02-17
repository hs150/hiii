
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirlineSystem system = new AirlineSystem();

       // This process is for registration
        System.out.println("Enter username:");
        String username = scanner.next();

        System.out.println("Enter password:");
        String password = scanner.next();

        // these are some line filling code

        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter email:");
        String email = scanner.next();

        System.out.println("Enter phone number:");
        String phoneNumber;
        // A loop for checking phone number is valid or not
        while (true) {
            phoneNumber = scanner.next();
            // Regular Expression is used
            if (phoneNumber.matches("\\d{10}")) {
                break;
            } else {
                System.out.println("Invalid phone number. Please enter a 10-digit phone number.");
            }
        }

        System.out.println("You have been registered successfully. ");
        System.out.println("Please login to BOOK tickets through our Airline. ");
        // Running the login portal
        AirlineSystem.Customer customer = system.new Customer(username, password, name, email, phoneNumber, "", "",0 );
        customer.loginDetails();

        // Displaying origin
        AirlineSystem.Origin origin = system.new Origin();
        origin.displayOrigins();
        int Choice;
        while (true) {
            System.out.println("Enter Your Origin By Choosing Choice Between 1 to 6 .");
            if (scanner.hasNextInt()) {
                Choice = scanner.nextInt();
                if (Choice >= 1 && Choice <= 6) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } else {
                System.out.println("Invalid input. Please enter a Number between 1 to 6");
                scanner.next();
            }

        }
        // Displaying destination
        AirlineSystem.Destination destination = system.new Destination();
        destination.displayDestinations();

        // Choosing destination and origin for our fare
        int choice;
        while (true) {
            System.out.println("Enter Your Destination By Choosing choice (1-6):");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 6) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            } else {
                System.out.println("Invalid input. Please enter a Number between 1 to 6");
                scanner.next();
            }

        }
        // the loop which we earlier created work now

        String chosenDestination = destination.destinations[choice - 1];
        String chosenOrigin = origin.origins[Choice - 1];

        // Running a loop for fetching price
        int[] Price = { 5000 , 7000 , 8000 ,9000 ,2000};
        Random rand  = new Random();
        int selectedPrice= Price[rand.nextInt(Price.length)];

        customer = system.new Customer(username, password, name, email, phoneNumber, chosenDestination, chosenOrigin , selectedPrice);
        customer.displayDetails();
    }
}

