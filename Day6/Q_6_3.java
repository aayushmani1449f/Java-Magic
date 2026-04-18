import java.util.Scanner;

public class Q_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Not Prime");
            return;
        }
        if (n == 2) {
            System.out.println("Prime");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
