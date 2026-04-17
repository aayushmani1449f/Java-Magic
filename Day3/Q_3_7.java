import java.util.Scanner;

public class Q_3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // odd position in 1-based indexing => indices 0,2,4...
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i]);
            if (i + 2 < n) System.out.print(" ");
        }
        System.out.println();
    }
}

