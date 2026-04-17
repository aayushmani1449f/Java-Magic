import java.util.Random;

public class Q_5_1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q_5_1 <numberOfFlips>");
            return;
        }

        int flips;
        try {
            flips = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        Random random = new Random();
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < flips; i++) {
            if (random.nextDouble() < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headPct = (heads * 100.0) / flips;
        double tailPct = (tails * 100.0) / flips;

        System.out.printf("Heads: %.2f%%%n", headPct);
        System.out.printf("Tails: %.2f%%%n", tailPct);
    }
}

