public class TaxiFactory {
    public static Taxi createTaxi(String type) {
        switch (type.toLowerCase()) {
            case "comfort":
                return new ComfortTaxi();
            case "business":
                return new BusinessTaxi();
            default:
                return null;
        }
    }
}
