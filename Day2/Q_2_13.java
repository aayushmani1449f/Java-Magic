public class Q_2_13 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Q_2_13 <x> <y>");
            return;
        }

        int x;
        int y;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Provide integer values for x and y.");
            return;
        }

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(distance);
    }
}

