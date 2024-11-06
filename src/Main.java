import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxiService taxiService = new TaxiService();

        System.out.println("Enter your name:");
        String userName = scanner.nextLine();
        User user = new User(userName);

        System.out.println("Welcome to the Taxi Booking System, " + userName);
        System.out.println("Choose taxi type (Comfort or Business):");
        String taxiType = scanner.nextLine();

        System.out.println("Do you want WiFi? (yes or no):");
        boolean addWiFi = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Select pickup district (Nurinsky, Yesilsky, Almatinsky, Baykonur):");
        String pickup = scanner.nextLine();
        if (!pickup.matches("Nurinsky|Yesilsky|Almatinsky|Baykonur")) {
            System.out.println("Invalid pickup district.");
            scanner.close();
            return;
        }

        System.out.println("Select drop-off district (Nurinsky, Yesilsky, Almatinsky, Baykonur):");
        String dropoff = scanner.nextLine();
        if (!dropoff.matches("Nurinsky|Yesilsky|Almatinsky|Baykonur")) {
            System.out.println("Invalid drop-off district.");
            scanner.close();
            return;
        }

        taxiService.bookTaxi(taxiType, addWiFi, pickup, dropoff, user);

        scanner.close();
    }
}
