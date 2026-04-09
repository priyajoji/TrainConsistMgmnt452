import java.util.Arrays;
import java.util.Scanner;

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {

        // UC19: Unsorted bogie IDs (system will sort before search)
        String[] uc19BogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 1: Sort the array (precondition for Binary Search)
        Arrays.sort(uc19BogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(uc19BogieIds));

        Scanner uc19Scanner = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String uc19SearchKey = uc19Scanner.nextLine();

        boolean uc19Found = uc19BinarySearch(uc19BogieIds, uc19SearchKey);

        if (uc19Found) {
            System.out.println("Bogie ID found using Binary Search.");
        } else {
            System.out.println("Bogie ID NOT found.");
        }

        uc19Scanner.close();
    }

    // UC19: Binary Search implementation
    public static boolean uc19BinarySearch(String[] uc19Array, String uc19Key) {

        int uc19Low = 0;
        int uc19High = uc19Array.length - 1;

        while (uc19Low <= uc19High) {

            int uc19Mid = (uc19Low + uc19High) / 2;

            int uc19Comparison = uc19Key.compareTo(uc19Array[uc19Mid]);

            if (uc19Comparison == 0) {
                return true; // Found
            } else if (uc19Comparison < 0) {
                uc19High = uc19Mid - 1; // Search left half
            } else {
                uc19Low = uc19Mid + 1; // Search right half
            }
        }

        return false; // Not found
    }
}
