public class BookingManager {
    private static BookingManager instance;
    private BookingManager() {}
    public static BookingManager getInstance() {
        if (instance == null) { instance = new BookingManager(); }
        return instance;
    }
    public void bookTaxi(Taxi taxi, User user, double totalCost) {
        user.notify("Taxi booked: " + taxi.getDescription() + ", Cost: " + totalCost + " Tenge");
    }
}
