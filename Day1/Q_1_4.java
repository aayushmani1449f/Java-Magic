public class Q_1_4 {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Invalid integers count: " + invalidCount);
    }
}

