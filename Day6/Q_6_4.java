import java.util.Scanner;

public class Q_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        int x = Math.abs(n);
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        if (n < 0) {
            rev = -rev;
        }
        System.out.println("Reverse of " + original + " is " + rev);
    }
}
