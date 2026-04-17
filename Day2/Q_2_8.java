import java.util.Scanner;

public class Q_2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String token = sc.next();
        char ch = token.charAt(0);

        char c = Character.toLowerCase(ch);
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> {
                if (c >= 'a' && c <= 'z') {
                    System.out.println("Consonant");
                } else {
                    System.out.println("Not an alphabet");
                }
            }
        }
    }
}

