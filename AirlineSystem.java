public class AirlineSystem {

    class Origin {
        String[] origins = {"Mumbai", "Delhi", "Kolkata", "Bangalore", "Prayagraj", "Kanpur"};

        public void displayOrigins() {
            System.out.println("Choose your Origin:");
            for (int i = 0; i < origins.length; i++) {
                System.out.println((i + 1) + ". " + origins[i]);
            }
        }
    }

    class Destination {
        String[] destinations = {"Mumbai", "Delhi", "Kolkata", "Bangalore", "Prayagraj", "Kanpur"};

        public void displayDestinations() {
            System.out.println("Choose your Destination:");
            for (int i = 0; i < destinations.length; i++) {
                System.out.println((i + 1) + ". " + destinations[i]);
            }
        }
    }

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
        }

        public void displayDetails() {
            System.out.println("Hello, " + name + "! You have chosen " + origin +" as your Origin and "+ destination + " as your destination.");
            System.out.println("The price for the destination " + destination + " is: " + price);
        }

    }
}


// Here are all the details of the detailed analysis of the airline system project 
