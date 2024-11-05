import java.util.List;

public abstract class Taxi {
    protected String description = "Generic Taxi";
    protected String model;
    protected String licensePlate;
    protected int arrivalTime;

    public Taxi() {
        this.licensePlate = generateRandomLicensePlate();
        this.arrivalTime = generateRandomArrivalTime();
    }

    public String getDescription() { return description; }
    public String getModel() { return model; }
    public String getLicensePlate() { return licensePlate; }
    public int getArrivalTime() { return arrivalTime; }
    public abstract double getBaseCost();
    protected abstract List<String> getModelsForClass();

    public void generateModel() {
        List<String> models = getModelsForClass();
        this.model = models.get((int)(Math.random() * models.size()));
    }

    private String generateRandomLicensePlate() {
        String digits = String.format("%03d", (int)(Math.random() * 900) + 100);
        String letters = "" + (char)('A' + (int)(Math.random() * 26)) +
                (char)('A' + (int)(Math.random() * 26)) +
                (char)('A' + (int)(Math.random() * 26));
        int region = (int)(Math.random() * 17) + 1;
        return String.format("%s%s%02d", digits, letters, region);
    }

    private int generateRandomArrivalTime() {
        return 2 + (int)(Math.random() * 6);
    }
}
