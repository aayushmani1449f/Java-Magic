package Day16_17;

import java.util.Arrays;

public class QuickSort {
    public static void sortProductPrices(double[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            sortProductPrices(prices, low, pi - 1);
            sortProductPrices(prices, pi + 1, high);
        }
    }

    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        double[] prices = {120.5, 80.0, 150.75, 50.25, 200.0, 99.99};
        System.out.println("Unsorted Product Prices: " + Arrays.toString(prices));
        sortProductPrices(prices, 0, prices.length - 1);
        System.out.println("Sorted Product Prices: " + Arrays.toString(prices));
    }
}
