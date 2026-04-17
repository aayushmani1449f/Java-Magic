public class Q_1_7 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q_1_7 <year>");
            return;
        }

        int year;
        try {
            year = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid year. Please provide an integer year.");
            return;
        }

        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian calendar).");
            return;
        }

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(isLeap ? "Year is a Leap Year" : "Year is not a Leap Year");
    }
}

