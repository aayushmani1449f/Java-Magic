import java.util.Scanner;

public class Q_3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int v : arr) {
            if (v > largest) {
                secondLargest = largest;
                largest = v;
            } else if (v != largest && v > secondLargest) {
                secondLargest = v;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest not found");
        } else {
            System.out.println(secondLargest);
        }
    }
}

