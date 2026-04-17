import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q_3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int v : arr) {
            if (!seen.add(v)) duplicates.add(v);
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates");
            return;
        }

        boolean first = true;
        for (int v : duplicates) {
            if (!first) System.out.print(" ");
            System.out.print(v);
            first = false;
        }
        System.out.println();
    }
}

