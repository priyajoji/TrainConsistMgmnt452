import java.util.Arrays;
import java.util.Scanner;

public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        // UC20: Change this to {} to test exception case
        String[] uc20BogieIds = {"BG101", "BG205", "BG309"};

        Scanner uc20Scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String uc20SearchKey = uc20Scanner.nextLine();

        try {
            boolean uc20Result = uc20SearchWithValidation(uc20BogieIds, uc20SearchKey);

            if (uc20Result) {
                System.out.println("Bogie ID found.");
            } else {
                System.out.println("Bogie ID NOT found.");
            }

        } catch (IllegalStateException uc20Exception) {
            System.out.println("Error: " + uc20Exception.getMessage());
        }

        uc20Scanner.close();
    }

    // UC20: Validation + Search
    public static boolean uc20SearchWithValidation(String[] uc20Array, String uc20Key) {

        // Fail-fast validation
        if (uc20Array == null || uc20Array.length == 0) {
            throw new IllegalStateException("Train consist is empty. Cannot perform search.");
        }

        // Optional: sort before search (safe for future extension like binary search)
        Arrays.sort(uc20Array);

        // Linear search (can be swapped with binary search if needed)
        for (String uc20Id : uc20Array) {
            if (uc20Id.equals(uc20Key)) {
                return true;
            }
        }

        return false;
    }
}
