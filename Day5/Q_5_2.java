public class Q_5_2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q_5_2 <year>");
            return;
        }

        int year;
        try {
            year = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid year.");
            return;
        }

        if (year < 1000 || year > 9999) {
            System.out.println("Year must be a 4 digit number.");
            return;
        }

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(isLeap ? "Year is a Leap Year" : "Year is not a Leap Year");
    }
}

