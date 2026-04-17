public class Q_5_5 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q_5_5 <N>");
            return;
        }

        long n;
        try {
            n = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid N.");
            return;
        }

        if (n <= 1) {
            System.out.println("N must be > 1.");
            return;
        }

        StringBuilder out = new StringBuilder();
        long m = n;
        for (long i = 2; i * i <= m; i++) {
            while (m % i == 0) {
                if (!out.isEmpty()) out.append(" ");
                out.append(i);
                m /= i;
            }
        }
        if (m > 1) {
            if (!out.isEmpty()) out.append(" ");
            out.append(m);
        }

        System.out.println(out);
    }
}

