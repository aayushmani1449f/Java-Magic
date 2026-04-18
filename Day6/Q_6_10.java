public class Q_6_10 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Q_6_10 <P> <Y> <R>");
            return;
        }
        double p = Double.parseDouble(args[0]);
        int y = Integer.parseInt(args[1]);
        double r = Double.parseDouble(args[2]);
        System.out.println(Util.monthlyPayment(p, y, r));
    }
}
