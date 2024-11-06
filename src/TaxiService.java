public class TaxiService {
    private BookingManager bookingManager = BookingManager.getInstance();

    public void bookTaxi(String type, boolean addWiFi, String pickup, String dropoff, User user) {
        Taxi taxi = TaxiFactory.createTaxi(type);
        if (taxi == null) {
            System.out.println("Invalid taxi type selected.");
            return;
        }
        if (addWiFi) {
            taxi = new WiFiDecorator(taxi);
        }
        double baseCost = taxi.getBaseCost();
        double fare = District.getFare(pickup, dropoff);
        double totalCost = baseCost + fare;

        if (type.equalsIgnoreCase("business")) {
            if (totalCost > 8470.0) totalCost = 8470.0;
            if (totalCost < 4000.0) totalCost = 4000.0;
        }
        if (type.equalsIgnoreCase("comfort")) {
            if (totalCost > 3500.0) totalCost = 3500.0;
            if (totalCost < 1800.0) totalCost = 1800.0;
        }

        bookingManager.bookTaxi(taxi, user, totalCost);

        System.out.println("Car Model: " + taxi.getModel());
        System.out.println("License Plate: " + taxi.getLicensePlate());
        System.out.println("Estimated Arrival Time: " + taxi.getArrivalTime() + " minutes");
    }
}
