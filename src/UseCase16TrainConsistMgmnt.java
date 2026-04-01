import java.util.ArrayList;
import java.util.List;

class BogieUC16 {
    String uc16Name;
    int uc16Capacity;

    BogieUC16(String uc16Name, int uc16Capacity) {
        this.uc16Name = uc16Name;
        this.uc16Capacity = uc16Capacity;
    }
}

public class UseCase16TrainConsistMgmnt {

    public static void main(String[] args) {

        List<BogieUC16> uc16BogieList = new ArrayList<>();

        uc16BogieList.add(new BogieUC16("Sleeper", 72));
        uc16BogieList.add(new BogieUC16("AC Chair", 56));
        uc16BogieList.add(new BogieUC16("First Class", 40));
        uc16BogieList.add(new BogieUC16("AC Chair Plus", 65));

        System.out.println("Before Sorting:");
        printUC16List(uc16BogieList);

        // ---------------- BUBBLE SORT ----------------
        int n = uc16BogieList.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (uc16BogieList.get(j).uc16Capacity > uc16BogieList.get(j + 1).uc16Capacity) {

                    // swap
                    BogieUC16 temp = uc16BogieList.get(j);
                    uc16BogieList.set(j, uc16BogieList.get(j + 1));
                    uc16BogieList.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nAfter Sorting (By Capacity - Ascending):");
        printUC16List(uc16BogieList);
    }

    private static void printUC16List(List<BogieUC16> list) {
        for (BogieUC16 b : list) {
            System.out.println(b.uc16Name + " -> " + b.uc16Capacity);
        }
    }
}
