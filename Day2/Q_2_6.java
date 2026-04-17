import java.util.Scanner;

public class Q_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int digits = 0;
        int temp = Math.abs(n);
        if (temp == 0) {
            digits = 1;
        } else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }

        int rev = 0;
        int m = n;
        for (int i = 0; i < digits; i++) {
            int digit = m % 10;
            rev = rev * 10 + digit;
            m /= 10;
        }

        System.out.println("Reverse of " + original + " is " + rev);
    }
}

