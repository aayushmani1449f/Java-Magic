import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int v : arr) freq.put(v, freq.getOrDefault(v, 0) + 1);

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

