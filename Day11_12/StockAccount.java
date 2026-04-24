import java.util.ArrayList;
import java.util.List;

public class StockAccount {
    private List<CompanyShares> sharesList;

    public StockAccount(String filename) {
        this.sharesList = new ArrayList<>();
        System.out.println("Loaded account from " + filename);
    }

    public double valueOf() {
        double totalValue = 0;
        for (CompanyShares shares : sharesList) {
            totalValue += shares.getNumberOfShares() * 100.0; // Mock price of $100 per share
        }
        return totalValue;
    }

    public void buy(int amount, String symbol) {
        for (CompanyShares shares : sharesList) {
            if (shares.getStockSymbol().equals(symbol)) {
                shares.addShares(amount);
                return;
            }
        }
        sharesList.add(new CompanyShares(symbol, amount));
    }

    public void sell(int amount, String symbol) {
        for (CompanyShares shares : sharesList) {
            if (shares.getStockSymbol().equals(symbol)) {
                if (shares.getNumberOfShares() >= amount) {
                    shares.subtractShares(amount);
                    if (shares.getNumberOfShares() == 0) {
                        sharesList.remove(shares);
                    }
                } else {
                    System.out.println("Not enough shares to sell.");
                }
                return;
            }
        }
        System.out.println("Stock symbol not found in account.");
    }

    public void save(String filename) {
        System.out.println("Saved account data to " + filename);
    }

    public void printReport() {
        System.out.println("----- Stock Account Report -----");
        for (CompanyShares shares : sharesList) {
            System.out.println(shares.toString());
        }
        System.out.println("--------------------------------");
        System.out.printf("Total Account Value: $%.2f%n", valueOf());
    }

    public static void main(String[] args) {
        StockAccount account = new StockAccount("myportfolio.txt");
        account.buy(10, "AAPL");
        account.buy(5, "GOOGL");
        account.printReport();

        account.sell(3, "AAPL");
        account.buy(2, "TSLA");
        account.printReport();

        account.save("myportfolio.txt");
    }
}
