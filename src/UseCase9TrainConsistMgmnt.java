import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmnt {

    // Bogie model reused from UC7/UC8
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        // UC9 flow
        uc9CreateBogies(bogies);
        Map<String, List<Bogie>> grouped = uc9GroupBogiesByType(bogies);
        uc9DisplayGroupedBogies(grouped);

        System.out.println("Program continues...");
    }

    // UC9: Create bogies
    public static void uc9CreateBogies(List<Bogie> bogies) {

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));      // duplicate type allowed for grouping
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("Bogies created.");
    }

    // UC9: Group bogies using groupingBy
    public static Map<String, List<Bogie>> uc9GroupBogiesByType(List<Bogie> bogies) {

        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }

    // UC9: Display grouped output
    public static void uc9DisplayGroupedBogies(Map<String, List<Bogie>> grouped) {

        System.out.println("Grouped Bogies by Type:");

        if (grouped.isEmpty()) {
            System.out.println("No bogies available.");
            return;
        }

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("\nType: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }
    }
}
