import java.util.Scanner;

public class Q_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            return;
        }
        long a = 0;
        long b = 1;
        System.out.print(a);
        if (n == 1) {
            System.out.println();
            return;
        }
        System.out.print(" " + b);
        for (int i = 3; i <= n; i++) {
            long c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
