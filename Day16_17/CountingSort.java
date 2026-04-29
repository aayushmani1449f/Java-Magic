package Day16_17;

import java.util.Arrays;

public class CountingSort {
    public static void sortAges(int[] ages) {
        if (ages.length == 0) return;
        
        int max = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > max)
                max = ages[i];
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < ages.length; i++) {
            count[ages[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i]] - 1] = ages[i];
            count[ages[i]]--;
        }

        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 14, 15, 12, 16, 17, 13, 18, 10};
        System.out.println("Unsorted Ages: " + Arrays.toString(ages));
        sortAges(ages);
        System.out.println("Sorted Ages: " + Arrays.toString(ages));
    }
}
