import java.util.Scanner;

public class Q_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // even position in 1-based indexing => indices 1,3,5...
        for (int i = 1; i < n; i += 2) {
            System.out.print(arr[i]);
            if (i + 2 < n) System.out.print(" ");
        }
        System.out.println();
    }
}

