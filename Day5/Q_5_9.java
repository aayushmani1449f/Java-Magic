import java.util.Scanner;

public class Q_5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String token = sc.next();
        char ch = token.charAt(0);

        char c = Character.toLowerCase(ch);
        if (c < 'a' || c > 'z') {
            System.out.println("Not an alphabet");
            return;
        }

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}

