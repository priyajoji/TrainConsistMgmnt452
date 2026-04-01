import java.util.ArrayList;
import java.util.List;

class BogieUC12 {
    String uc12Type;
    String uc12Cargo;

    BogieUC12(String uc12Type, String uc12Cargo) {
        this.uc12Type = uc12Type;
        this.uc12Cargo = uc12Cargo;
    }
}

public class UseCase12TrainConsistMgmnt {

    public static void main(String[] args) {

        List<BogieUC12> uc12GoodsBogieList = new ArrayList<>();

        // Sample data (can be modified during testing)
        uc12GoodsBogieList.add(new BogieUC12("Cylindrical", "Petroleum"));
        uc12GoodsBogieList.add(new BogieUC12("Box", "Coal"));
        uc12GoodsBogieList.add(new BogieUC12("Open", "Grain"));

        // Safety compliance check using streams + allMatch
        boolean uc12IsSafeTrain = uc12GoodsBogieList.stream()
                .allMatch(b -> {
                    if ("Cylindrical".equalsIgnoreCase(b.uc12Type)) {
                        return "Petroleum".equalsIgnoreCase(b.uc12Cargo);
                    }
                    return true;
                });

        // Output
        if (uc12IsSafeTrain) {
            System.out.println("Train is safety compliant.");
        } else {
            System.out.println("Train is NOT safety compliant.");
        }
    }
}
