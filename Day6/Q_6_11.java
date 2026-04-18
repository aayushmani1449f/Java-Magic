public class Q_6_11 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Q_6_11 <c>");
            return;
        }
        double c = Double.parseDouble(args[0]);
        System.out.println(Util.sqrtNewton(c));
    }
}
