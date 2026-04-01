import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize HashMap for bogie-capacity mappingmapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // UC6 flow
        uc6AddBogieCapacities(bogieCapacityMap);
        uc6DisplayBogieCapacities(bogieCapacityMap);

        System.out.println("Program continues...");
    }

    // UC6: Add bogie-capacity mappings
    public static void uc6AddBogieCapacities(Map<String, Integer> map) {
        map.put("Sleeper", 72);
        map.put("AC Chair", 60);
        map.put("First Class", 24);

        System.out.println("Bogie capacities added.");
    }

    // UC6: Display bogie-capacity mappings
    public static void uc6DisplayBogieCapacities(Map<String, Integer> map) {
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}
