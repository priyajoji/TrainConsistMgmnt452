class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogieUC14 {
    String uc14Type;
    int uc14Capacity;

    PassengerBogieUC14(String uc14Type, int uc14Capacity) throws InvalidCapacityException {

        if (uc14Capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.uc14Type = uc14Type;
        this.uc14Capacity = uc14Capacity;
    }
}

public class UseCase14TrainConsistMgmnt {

    public static void main(String[] args) {

        try {
            // Valid bogies
            PassengerBogieUC14 uc14b1 = new PassengerBogieUC14("Sleeper", 72);
            PassengerBogieUC14 uc14b2 = new PassengerBogieUC14("AC Chair", 56);
            PassengerBogieUC14 uc14b3 = new PassengerBogieUC14("First Class", 40);

            System.out.println("All valid bogies created successfully.");

            // Invalid bogies (uncomment to test exceptions)
            // PassengerBogieUC14 uc14b4 = new PassengerBogieUC14("Sleeper", -10);
            // PassengerBogieUC14 uc14b5 = new PassengerBogieUC14("AC Chair", 0);

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}
