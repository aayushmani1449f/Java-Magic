import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_6_7 {
    private static final int[] NOTES = {1000, 500, 100, 50, 10, 5, 2, 1};

    public static void collectChange(int change, int idx, List<Integer> out) {
        if (change == 0) {
            return;
        }
        if (idx >= NOTES.length) {
            return;
        }
        if (change >= NOTES[idx]) {
            out.add(NOTES[idx]);
            collectChange(change - NOTES[idx], idx, out);
        } else {
            collectChange(change, idx + 1, out);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        if (change < 0) {
            return;
        }
        List<Integer> notes = new ArrayList<>();
        collectChange(change, 0, notes);
        System.out.println(notes.size());
        for (int n : notes) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
