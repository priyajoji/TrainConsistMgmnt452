import java.util.Arrays;

public class UseCase17TrainConsistMgmnt {

    public static void main(String[] args) {

        // UC17: Create array of bogie names
        String[] uc17BogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(uc17BogieNames));

        // UC17: Sort using built-in method
        Arrays.sort(uc17BogieNames);

        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(uc17BogieNames));
    }
}
