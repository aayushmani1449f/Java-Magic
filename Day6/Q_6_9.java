public class Q_6_9 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Q_6_9 C2F <celsius> | F2C <fahrenheit>");
            return;
        }
        String mode = args[0];
        double v = Double.parseDouble(args[1]);
        if (mode.equalsIgnoreCase("C2F")) {
            System.out.println(Util.celsiusToFahrenheit(v));
        } else if (mode.equalsIgnoreCase("F2C")) {
            System.out.println(Util.fahrenheitToCelsius(v));
        } else {
            System.out.println("Unknown mode");
        }
    }
}
