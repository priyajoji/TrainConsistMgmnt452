import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Initialize passenger bogie list
        List<String> passengerBogies = new ArrayList<>();

        // UC2 flow
        uc2AddPassengerBogies(passengerBogies);
        uc2DisplayBogies(passengerBogies);
        uc2RemoveBogie(passengerBogies, "AC Chair");
        uc2CheckExistence(passengerBogies, "Sleeper");
        uc2DisplayBogies(passengerBogies);

        System.out.println("Program continues...");
    }

    // UC2: Add bogies
    public static void uc2AddPassengerBogies(List<String> bogies) {
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");
        System.out.println("Passenger bogies added.");
    }

    // UC2: Display bogies
    public static void uc2DisplayBogies(List<String> bogies) {
        System.out.println("Current bogies: " + bogies);
    }

    // UC2: Remove bogie
    public static void uc2RemoveBogie(List<String> bogies, String bogieName) {
        if (bogies.remove(bogieName)) {
            System.out.println(bogieName + " bogie removed.");
        } else {
            System.out.println(bogieName + " bogie not found.");
        }
    }

    // UC2: Check existence
    public static void uc2CheckExistence(List<String> bogies, String bogieName) {
        if (bogies.contains(bogieName)) {
            System.out.println(bogieName + " bogie exists in the train.");
        } else {
            System.out.println(bogieName + " bogie does NOT exist in the train.");
        }
    }
}
