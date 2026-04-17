public class Q_1_6 {
    static int counter;

    static {
        counter = 100;
        System.out.println("Static block executed. counter initialized to " + counter);
    }

    static void increment() {
        counter++;
    }

    static void printCounter() {
        System.out.println("counter = " + counter);
    }

    public static void main(String[] args) {
        System.out.println("Inside main.");
        printCounter();
        increment();
        increment();
        printCounter();
    }
}

