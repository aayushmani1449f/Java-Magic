import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CompanyShares {
    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionDateTime;

    public CompanyShares(String stockSymbol, int numberOfShares) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.transactionDateTime = LocalDateTime.now();
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void addShares(int amount) {
        this.numberOfShares += amount;
        this.transactionDateTime = LocalDateTime.now();
    }

    public void subtractShares(int amount) {
        this.numberOfShares -= amount;
        this.transactionDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("Symbol: %-5s | Shares: %-5d | Last Transaction: %s",
                stockSymbol, numberOfShares, transactionDateTime.format(formatter));
    }
}
