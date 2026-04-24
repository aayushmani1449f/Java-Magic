public class Card {
    private String suit;
    private String rank;
    private int rankValue;

    public Card(String suit, String rank, int rankValue) {
        this.suit = suit;
        this.rank = rank;
        this.rankValue = rankValue;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getRankValue() {
        return rankValue;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
