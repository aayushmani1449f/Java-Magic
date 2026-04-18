import java.util.Scanner;

public class Q_6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter to start");
        sc.nextLine();
        long start = System.nanoTime();
        System.out.println("Press Enter to stop");
        sc.nextLine();
        long end = System.nanoTime();
        double seconds = (end - start) / 1_000_000_000.0;
        System.out.println("Elapsed seconds: " + seconds);
    }
}
