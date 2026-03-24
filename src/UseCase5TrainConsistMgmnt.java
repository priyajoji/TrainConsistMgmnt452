import java.util.LinkedHashSet;

public class UseCase5TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedHashSet for ordered, unique bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // UC5 flow
        uc5AddBogies(trainFormation);
        uc5DisplayFormation(trainFormation);

        System.out.println("Program continues...");
    }

    // UC5: Add bogies (with intentional duplicate)
    public static void uc5AddBogies(LinkedHashSet<String> formation) {
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate attempt

        System.out.println("Bogies added (duplicate attempt included).");
    }

    // UC5: Display final formation
    public static void uc5DisplayFormation(LinkedHashSet<String> formation) {
        System.out.println("Final train formation (in insertion order): " + formation);
    }
}
