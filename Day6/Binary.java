import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = Util.toBinary(n);
        System.out.println(bin);
        int b = n & 0xFF;
        int swapped = ((b & 0x0F) << 4) | ((b & 0xF0) >>> 4);
        System.out.println(swapped);
        boolean pow2 = swapped > 0 && (swapped & (swapped - 1)) == 0;
        System.out.println(pow2);
    }
}
