import java.util.Scanner;

public class Q_5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be 0");
            return;
        }

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}

