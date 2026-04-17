public class Q_2_11 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Q_2_11 <month> <day>");
            return;
        }

        int m;
        int d;
        try {
            m = Integer.parseInt(args[0]);
            d = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Provide integers for month and day.");
            return;
        }

        boolean inSpring =
                (m == 3 && d >= 20 && d <= 31) ||
                (m == 4 && d >= 1 && d <= 30) ||
                (m == 5 && d >= 1 && d <= 31) ||
                (m == 6 && d >= 1 && d <= 20);

        System.out.println(inSpring);
    }
}

