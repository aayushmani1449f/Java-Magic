public class Q_5_3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q_5_3 <N>");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid N.");
            return;
        }

        if (n < 0 || n >= 31) {
            System.out.println("N must satisfy 0 <= N < 31.");
            return;
        }

        int value = 1;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                value = 1;
            } else {
                value *= 2;
            }
            System.out.println("2^" + i + " = " + value);
        }
    }
}

