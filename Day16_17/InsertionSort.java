package Day16_17;

import java.util.Arrays;

public class InsertionSort {
    public static void sortEmployeeIDs(int[] employeeIDs) {
        int n = employeeIDs.length;
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i];
            int j = i - 1;
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j = j - 1;
            }
            employeeIDs[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 108, 101, 104, 107};
        System.out.println("Unsorted Employee IDs: " + Arrays.toString(employeeIDs));
        sortEmployeeIDs(employeeIDs);
        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
    }
}
