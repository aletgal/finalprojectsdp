import java.util.HashMap;
import java.util.Map;

public class District {
    private static final Map<String, Map<String, Double>> fares = new HashMap<>();

    static {
        Map<String, Double> nurinskyFares = new HashMap<>();
        nurinskyFares.put("Yesilsky", 1800.0);
        nurinskyFares.put("Almatinsky", 2500.0);
        nurinskyFares.put("Baykonur", 3500.0);

        Map<String, Double> yesilskyFares = new HashMap<>();
        yesilskyFares.put("Nurinsky", 1800.0);
        yesilskyFares.put("Almatinsky", 2200.0);
        yesilskyFares.put("Baykonur", 3300.0);

        Map<String, Double> almatinskyFares = new HashMap<>();
        almatinskyFares.put("Nurinsky", 2500.0);
        almatinskyFares.put("Yesilsky", 2200.0);
        almatinskyFares.put("Baykonur", 2900.0);

        Map<String, Double> baykonurFares = new HashMap<>();
        baykonurFares.put("Nurinsky", 3500.0);
        baykonurFares.put("Yesilsky", 3300.0);
        baykonurFares.put("Almatinsky", 2900.0);

        fares.put("Nurinsky", nurinskyFares);
        fares.put("Yesilsky", yesilskyFares);
        fares.put("Almatinsky", almatinskyFares);
        fares.put("Baykonur", baykonurFares);
    }

    public static double getFare(String pickup, String dropoff) {
        return fares.getOrDefault(pickup, new HashMap<>()).getOrDefault(dropoff, 0.0);
    }
}
