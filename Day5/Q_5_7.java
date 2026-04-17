import java.util.Scanner;

public class Q_5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Before swap: a=" + a + ", b=" + b);

        double temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a=" + a + ", b=" + b);
    }
}

