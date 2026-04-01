import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase7TrainConsistMgmnt {

    // Bogie class (required for UC7)
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

        List<Bogie> passengerBogies = new ArrayList<>();

        // UC7 flow
        uc7AddBogies(passengerBogies);
        uc7SortByCapacity(passengerBogies);
        uc7DisplaySortedBogies(passengerBogies);

        System.out.println("Program continues...");
    }

    // UC7: Create and add bogies
    public static void uc7AddBogies(List<Bogie> list) {
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));

        System.out.println("Passenger bogies added.");
    }

    // UC7: Sort using Comparator
    public static void uc7SortByCapacity(List<Bogie> list) {
        list.sort(Comparator.comparingInt(b -> b.capacity));
        System.out.println("Bogies sorted by capacity.");
    }

    // UC7: Display result
    public static void uc7DisplaySortedBogies(List<Bogie> list) {
        System.out.println("Sorted Passenger Bogies (by capacity):");

        for (Bogie b : list) {
            System.out.println(b);
        }
    }
}
