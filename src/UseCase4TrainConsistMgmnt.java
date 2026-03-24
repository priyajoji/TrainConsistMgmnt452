import java.util.LinkedList;

public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // UC4 flow
        uc4AddBogies(train);
        uc4InsertPantryCar(train);
        uc4RemoveEnds(train);
        uc4DisplayTrain(train);

        System.out.println("Program continues...");
    }

    // UC4: Add initial bogies
    public static void uc4AddBogies(LinkedList<String> train) {
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial train consist: " + train);
    }

    // UC4: Insert Pantry Car at position 2
    public static void uc4InsertPantryCar(LinkedList<String> train) {
        train.add(2, "Pantry Car"); // index-based insertion
        System.out.println("After adding Pantry Car at position 2: " + train);
    }

    // UC4: Remove first and last bogie
    public static void uc4RemoveEnds(LinkedList<String> train) {
        train.removeFirst();
        train.removeLast();
        System.out.println("After removing first and last bogie: " + train);
    }

    // UC4: Display final train
    public static void uc4DisplayTrain(LinkedList<String> train) {
        System.out.println("Final ordered train consist: " + train);
    }
}
