import java.util.Scanner;

public class UseCase18TrainConsistMgmnt {

    public static void main(String[] args) {

        // UC18: Array of bogie IDs (unsorted)
        String[] uc18BogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner uc18Scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String uc18SearchKey = uc18Scanner.nextLine();

        boolean uc18Found = uc18LinearSearch(uc18BogieIds, uc18SearchKey);

        if (uc18Found) {
            System.out.println("Bogie ID found in the train.");
        } else {
            System.out.println("Bogie ID NOT found in the train.");
        }

        uc18Scanner.close();
    }

    // UC18: Linear Search implementation
    public static boolean uc18LinearSearch(String[] uc18Array, String uc18Key) {

        for (String uc18Id : uc18Array) {

            if (uc18Id.equals(uc18Key)) {
                return true; // Early termination
            }
        }

        return false; // Not found after full traversal
    }
}