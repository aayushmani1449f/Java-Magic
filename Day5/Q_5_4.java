public class Q_5_4 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q_5_4 <N>");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid N.");
            return;
        }

        if (n == 0) {
            System.out.println("N must not be 0.");
            return;
        }

        double sum = 0.0;
        int limit = Math.abs(n);
        for (int i = 1; i <= limit; i++) {
            sum += 1.0 / i;
        }

        if (n < 0) sum = -sum;
        System.out.println(sum);
    }
}

