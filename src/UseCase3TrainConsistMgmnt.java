import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // UC3 flow
        uc3AddBogieIds(bogieIds);
        uc3DisplayBogieIds(bogieIds);

        System.out.println("Program continues...");
    }

    // UC3: Add bogie IDs (with intentional duplicates)
    public static void uc3AddBogieIds(Set<String> ids) {
        ids.add("BG101");
        ids.add("BG102");
        ids.add("BG103");
        ids.add("BG101"); // duplicate
        ids.add("BG102"); // duplicate

        System.out.println("Bogie IDs added (including duplicates).");
    }

    // UC3: Display unique bogie IDs
    public static void uc3DisplayBogieIds(Set<String> ids) {
        System.out.println("Unique bogie IDs: " + ids);
    }
}
