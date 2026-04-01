import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmnt {

    // Bogie model reused from UC7 style
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

        // UC8 flow
        uc8CreateBogies(bogies);
        List<Bogie> filtered = uc8FilterBogiesByCapacity(bogies, 60);
        uc8DisplayFilteredBogies(filtered);

        System.out.println("Program continues...");
    }

    // UC8: Create bogies (reuse UC7 dataset idea)
    public static void uc8CreateBogies(List<Bogie> bogies) {
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Premium Sleeper", 80));

        System.out.println("Bogies created.");
    }

    // UC8: Stream filter operation
    public static List<Bogie> uc8FilterBogiesByCapacity(List<Bogie> bogies, int threshold) {

        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    // UC8: Display filtered result
    public static void uc8DisplayFilteredBogies(List<Bogie> filtered) {

        System.out.println("Filtered Bogies (capacity > 60):");

        if (filtered.isEmpty()) {
            System.out.println("No bogies match the condition.");
            return;
        }

        for (Bogie b : filtered) {
            System.out.println(b);
        }
    }
}
