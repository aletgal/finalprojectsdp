import java.util.List;

public abstract class TaxiDecorator extends Taxi {
    protected Taxi taxi;

    public TaxiDecorator(Taxi taxi) {
        this.taxi = taxi;
    }

    @Override
    public String getDescription() {
        return taxi.getDescription();
    }

    @Override
    public String getModel() {
        return taxi.getModel();
    }

    @Override
    public String getLicensePlate() {
        return taxi.getLicensePlate();
    }

    @Override
    public int getArrivalTime() {
        return taxi.getArrivalTime();
    }

    @Override
    public double getBaseCost() {
        return taxi.getBaseCost();
    }

    @Override
    protected List<String> getModelsForClass() {
        return taxi.getModelsForClass();
    }
}
