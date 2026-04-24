import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
    private List<Stock> stocks;

    public StockPortfolio() {
        this.stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        this.stocks.add(stock);
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.calculateValue();
        }
        return totalValue;
    }

    public void printReport() {
        System.out.println("----- Stock Portfolio Report -----");
        for (Stock stock : stocks) {
            System.out.println(stock.toString());
        }
        System.out.println("----------------------------------");
        System.out.printf("Total Portfolio Value: %.2f%n", calculateTotalValue());
    }
}
