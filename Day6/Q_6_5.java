import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q_6_5 {
    public static int generateRandom(int n) {
        if (n <= 0) {
            return 0;
        }
        return (int) (Math.random() * n);
    }

    public static int collectAllDistinct(int n) {
        if (n <= 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while (set.size() < n) {
            int c = generateRandom(n);
            count++;
            set.add(c);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3 };
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("N must be positive");
            return;
        }
        int draws = collectAllDistinct(n);
        System.out.println(draws);
    }
}
