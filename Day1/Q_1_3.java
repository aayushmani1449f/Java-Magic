public class Q_1_3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Q_1_3 <string1> <string2>");
            return;
        }

        String a = args[0];
        String b = args[1];
        System.out.println(a.equals(b) ? "Strings are equal" : "Strings are not equal");
    }
}

