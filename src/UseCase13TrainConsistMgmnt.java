import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BogieUC13 {
    String uc13Name;
    int uc13Capacity;

    BogieUC13(String uc13Name, int uc13Capacity) {
        this.uc13Name = uc13Name;
        this.uc13Capacity = uc13Capacity;
    }
}

public class UseCase13TrainConsistMgmnt {

    public static void main(String[] args) {

        List<BogieUC13> uc13BogieList = new ArrayList<>();

        // Sample dataset
        uc13BogieList.add(new BogieUC13("Sleeper", 72));
        uc13BogieList.add(new BogieUC13("AC Chair", 56));
        uc13BogieList.add(new BogieUC13("First Class", 40));
        uc13BogieList.add(new BogieUC13("Sleeper Extra", 80));
        uc13BogieList.add(new BogieUC13("AC Chair Plus", 65));

        // ---------------- LOOP BASED FILTERING ----------------
        long uc13LoopStart = System.nanoTime();

        List<BogieUC13> uc13LoopResult = new ArrayList<>();
        for (BogieUC13 b : uc13BogieList) {
            if (b.uc13Capacity > 60) {
                uc13LoopResult.add(b);
            }
        }

        long uc13LoopEnd = System.nanoTime();
        long uc13LoopTime = uc13LoopEnd - uc13LoopStart;

        // ---------------- STREAM BASED FILTERING ----------------
        long uc13StreamStart = System.nanoTime();

        List<BogieUC13> uc13StreamResult = uc13BogieList.stream()
                .filter(b -> b.uc13Capacity > 60)
                .collect(Collectors.toList());

        long uc13StreamEnd = System.nanoTime();
        long uc13StreamTime = uc13StreamEnd - uc13StreamStart;

        // ---------------- OUTPUT ----------------
        System.out.println("Loop Result Size: " + uc13LoopResult.size());
        System.out.println("Stream Result Size: " + uc13StreamResult.size());

        System.out.println("\nLoop Execution Time (ns): " + uc13LoopTime);
        System.out.println("Stream Execution Time (ns): " + uc13StreamTime);

        System.out.println("\nLoop and Stream results match: "
                + (uc13LoopResult.size() == uc13StreamResult.size()));
    }
}