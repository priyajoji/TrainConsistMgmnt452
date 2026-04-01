class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogieUC15 {
    String uc15Shape;
    String uc15Cargo;

    GoodsBogieUC15(String uc15Shape) {
        this.uc15Shape = uc15Shape;
    }

    public void assignCargo(String cargo) {
        try {
            if ("Rectangular".equalsIgnoreCase(this.uc15Shape)
                    && "Petroleum".equalsIgnoreCase(cargo)) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be assigned to Rectangular bogie");
            }

            this.uc15Cargo = cargo;
            System.out.println("Cargo assigned: " + cargo + " to " + uc15Shape + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment process completed for " + uc15Shape + " bogie");
        }
    }
}

public class UseCase15TrainConsistMgmnt {

    public static void main(String[] args) {

        GoodsBogieUC15 uc15b1 = new GoodsBogieUC15("Cylindrical");
        GoodsBogieUC15 uc15b2 = new GoodsBogieUC15("Rectangular");

        // Safe assignment
        uc15b1.assignCargo("Petroleum");

        System.out.println();

        // Unsafe assignment (handled safely)
        uc15b2.assignCargo("Petroleum");

        System.out.println();

        // Program continues
        uc15b1.assignCargo("Coal");
    }
}
