import java.util.Scanner;

public class Q_5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println(largest);
    }
}

