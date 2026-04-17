public class Q_2_12 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Q_2_12 <a> <b> <c>");
            return;
        }

        double a;
        double b;
        double c;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Provide numeric values for a, b, c.");
            return;
        }

        if (a == 0) {
            System.out.println("Not a quadratic equation (a must be non-zero).");
            return;
        }

        double delta = b * b - 4 * a * c;
        System.out.println("delta = " + delta);

        if (delta >= 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-delta) / (2 * a);
            System.out.println("Root 1 = " + real + " + " + imag + "i");
            System.out.println("Root 2 = " + real + " - " + imag + "i");
        }
    }
}

