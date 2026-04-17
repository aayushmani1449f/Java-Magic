import java.util.Scanner;

public class Q_2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int exp1 = a + b * c;
        int exp2 = c + a / b;
        int exp3 = a % b + c;
        int exp4 = a * b + c;

        int max = exp1;
        int min = exp1;
        int[] vals = {exp1, exp2, exp3, exp4};
        for (int v : vals) {
            if (v > max) max = v;
            if (v < min) min = v;
        }

        System.out.println("a + b * c = " + exp1);
        System.out.println("c + a / b = " + exp2);
        System.out.println("a % b + c = " + exp3);
        System.out.println("a * b + c = " + exp4);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

