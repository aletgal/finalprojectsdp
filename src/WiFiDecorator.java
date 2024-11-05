public class WiFiDecorator extends TaxiDecorator {
    public WiFiDecorator(Taxi taxi) {
        super(taxi);
    }

    @Override
    public String getDescription() {
        return taxi.getDescription() + ", WiFi";
    }

    @Override
    public double getBaseCost() {
        return taxi.getBaseCost() + 300.0;
    }
}
