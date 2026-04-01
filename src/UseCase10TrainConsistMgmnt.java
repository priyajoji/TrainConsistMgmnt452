import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmnt {

    // Bogie model reused across UC7–UC10
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        // UC10 flow
        uc10CreateBogies(bogies);
        int totalSeats = uc10CalculateTotalSeats(bogies);
        uc10DisplayTotalSeats(totalSeats);

        System.out.println("Program continues...");
    }

    // UC10: Create bogies
    public static void uc10CreateBogies(List<Bogie> bogies) {

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Premium Sleeper", 80));

        System.out.println("Bogies created.");
    }

    // UC10: Stream reduce aggregation
    public static int uc10CalculateTotalSeats(List<Bogie> bogies) {

        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    // UC10: Display result
    public static void uc10DisplayTotalSeats(int totalSeats) {

        System.out.println("Total Seating Capacity of Train: " + totalSeats);
    }
}
