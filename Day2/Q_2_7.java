import java.util.Scanner;

public class Q_2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int rev = 0;
        int m = n;
        while (m != 0) {
            int digit = m % 10;
            rev = rev * 10 + digit;
            m /= 10;
        }

        if (original == rev) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}

