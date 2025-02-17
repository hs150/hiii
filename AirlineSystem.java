import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AirlineSystem {

    Scanner scanner = new Scanner(System.in);
    Map<String, String> userCredentials = new HashMap<>();

    // Our Origin or our Starting point for our tour
    class Origin {
        String[] origins = {"Mumbai", "Delhi", "Kolkata", "Bangalore", "Prayagraj", "Kanpur"};

        public void displayOrigins() {
            System.out.println("Choose your Origin:");
            for (int i = 0; i < origins.length; i++) {
                System.out.println((i + 1) + ". " + origins[i]);
            }
        }
    }
    // Destination for our tour
    class Destination {
        String[] destinations = {"Mumbai", "Delhi", "Kolkata", "Bangalore", "Prayagraj", "Kanpur"};

        public void displayDestinations() {
            System.out.println("Choose your Destination:");
            for (int i = 0; i < destinations.length; i++) {
                System.out.println((i + 1) + ". " + destinations[i]);
            }
        }
    }

    // Creating our customer Details
     class Customer {
        String userName;
        String passWord;
        String name;
        String email;
        String phoneNumber;
        String destination;
        String origin;
        int price;

        public Customer(String userName, String passWord, String name, String email, String phoneNumber, String destination ,String origin , int price) {
            this.userName = userName;
            this.passWord = passWord;
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.destination = destination;
            this.origin = origin;
            this.price=price;
            // HashMap Enters here
            userCredentials.put(userName,passWord);
        }
        // Login Details Starts Here
        public void loginDetails(){
            while(true){
                System.out.println("Enter Your Username : ");
                String  Username = scanner.next();
                // Checking for username
                if (userCredentials.containsKey(Username)){
                    System.out.println("Enter Your Password :");
                    String password = scanner.next();
                    // Checking if password is correct for the specific username
                    if (userCredentials.get(userName).equals(password)){
                    System.out.println("Hello Mr." + name + " ,Welcome to our Airline Reservation System");
                    break;
                    }else{
                    System.out.println("Wrong Password try again.......");
                    }
                }else {
                    System.out.println("Wrong Username try again.....");
                }
            }
        }
        // It's just the Ending of our program don't focus on it too much
        public void displayDetails() {
            System.out.println("Hello, " + name + "! You have chosen " + origin +" as your Origin and "+ destination + " as your destination.");
            System.out.println("The price for the destination " + destination + " is: " + price);
            
        }

    }
}



