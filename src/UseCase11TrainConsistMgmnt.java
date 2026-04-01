import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmnt{

    public static void main(String[] args) {

        Scanner uc11Scanner = new Scanner(System.in);

        // Regex patterns (UC11)
        String uc11TrainIdRegex = "TRN-\\d{4}";
        String uc11CargoCodeRegex = "PET-[A-Z]{2}";

        Pattern uc11TrainIdPattern = Pattern.compile(uc11TrainIdRegex);
        Pattern uc11CargoCodePattern = Pattern.compile(uc11CargoCodeRegex);

        // Input
        System.out.print("Enter Train ID: ");
        String uc11TrainIdInput = uc11Scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String uc11CargoCodeInput = uc11Scanner.nextLine();

        // Empty input handling
        boolean uc11IsTrainEmpty = uc11TrainIdInput == null || uc11TrainIdInput.isEmpty();
        boolean uc11IsCargoEmpty = uc11CargoCodeInput == null || uc11CargoCodeInput.isEmpty();

        // Matchers
        Matcher uc11TrainIdMatcher = uc11TrainIdPattern.matcher(uc11TrainIdInput);
        Matcher uc11CargoCodeMatcher = uc11CargoCodePattern.matcher(uc11CargoCodeInput);

        boolean uc11IsTrainIdValid = !uc11IsTrainEmpty && uc11TrainIdMatcher.matches();
        boolean uc11IsCargoCodeValid = !uc11IsCargoEmpty && uc11CargoCodeMatcher.matches();

        // Output results
        if (uc11IsTrainIdValid) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format.");
        }

        if (uc11IsCargoCodeValid) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format.");
        }

        uc11Scanner.close();
    }
}