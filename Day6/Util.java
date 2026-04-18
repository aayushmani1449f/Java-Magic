public final class Util {
    private Util() {
    }

    public static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return Math.floorMod(d + x + 31 * m0 / 12, 7);
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32.0) * 5.0 / 9.0;
    }

    public static double monthlyPayment(double principal, int years, double annualRatePercent) {
        int n = 12 * years;
        double r = annualRatePercent / (12.0 * 100.0);
        if (r == 0) {
            return principal / n;
        }
        return principal * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1.0);
    }

    public static double sqrtNewton(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        if (c == 0) {
            return 0;
        }
        double epsilon = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

    public static String toBinary(int n) {
        String s = Integer.toBinaryString(n);
        if (s.length() > 32) {
            s = s.substring(s.length() - 32);
        }
        return String.format("%32s", s).replace(' ', '0');
    }
}
