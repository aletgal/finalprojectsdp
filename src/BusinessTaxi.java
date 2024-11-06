import java.util.Arrays;
import java.util.List;

public class BusinessTaxi extends Taxi {
    public BusinessTaxi() {
        description = "Business Taxi";
        generateModel();
    }
    public double getBaseCost() { return 4000.0; }

    @Override
    protected List<String> getModelsForClass() {
        return Arrays.asList("Hyundai Sonata", "Toyota Camry XV75", "Mercedes-Benz S-Class", "BMW 5-Series", "Lexus LS");
    }
}
