import java.util.Arrays;
import java.util.List;

public class ComfortTaxi extends Taxi {
    public ComfortTaxi() {
        description = "Comfort Taxi";
        generateModel();
    }
    public double getBaseCost() { return 1800.0; }

    @Override
    protected List<String> getModelsForClass() {
        return Arrays.asList("Hyundai Elantra", "Toyota Camry XV50", "Kia Cerato", "Audi A6", "Mercedes-Benz E-Class");
    }
}
