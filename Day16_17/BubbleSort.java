package Day16_17;

import java.util.Arrays;

public class BubbleSort {
    public static void sortMarks(int[] marks) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 90, 88, 76};
        System.out.println("Unsorted Marks: " + Arrays.toString(marks));
        sortMarks(marks);
        System.out.println("Sorted Marks: " + Arrays.toString(marks));
    }
}
