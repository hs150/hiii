// This is the Main Class for Airline System As of 16 feb 2025

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirlineSystem system = new AirlineSystem();

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


        AirlineSystem.Destination destination = system.new Destination();
        destination.displayDestinations();


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

        String chosenDestination = destination.destinations[choice - 1];
        String chosenOrigin = origin.origins[Choice - 1];

        System.out.println("Enter username:");
        String username = scanner.next();

        System.out.println("Enter password:");
        String password = scanner.next();

        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("Enter email:");
        String email = scanner.next();

        System.out.println("Enter phone number:");
        String phoneNumber;
        while (true) {
            phoneNumber = scanner.next();
            if (phoneNumber.matches("\\d{10}")) {
                break;
            } else {
                System.out.println("Invalid phone number. Please enter a 10-digit phone number.");
            }
        }


        int[] Price = { 5000 , 7000 , 8000 ,9000 ,2000};
        Random rand  = new Random();
        int selectedPrice= Price[rand.nextInt(Price.length)];

        AirlineSystem.Customer customer = system.new Customer(username, password, name, email, phoneNumber, chosenDestination, chosenOrigin , selectedPrice);
        customer.displayDetails();
    }
}

