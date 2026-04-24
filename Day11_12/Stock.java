public class Stock {
    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double calculateValue() {
        return numberOfShares * sharePrice;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    @Override
    public String toString() {
        return String.format("Stock[Name: %s, Shares: %d, Price: %.2f, Value: %.2f]",
                name, numberOfShares, sharePrice, calculateValue());
    }
}
