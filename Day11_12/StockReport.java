import java.util.Scanner;

public class StockReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for stock " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Number of Shares: ");
            int shares = scanner.nextInt();
            System.out.print("Share Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
        scanner.close();
    }
}
