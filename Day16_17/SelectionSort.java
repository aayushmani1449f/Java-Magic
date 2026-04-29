package Day16_17;

import java.util.Arrays;

public class SelectionSort {
    public static void sortExamScores(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {65, 82, 45, 90, 78, 88};
        System.out.println("Unsorted Exam Scores: " + Arrays.toString(scores));
        sortExamScores(scores);
        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));
    }
}
