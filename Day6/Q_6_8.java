public class Q_6_8 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Q_6_8 <m> <d> <y>");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        System.out.println(Util.dayOfWeek(m, d, y));
    }
}
