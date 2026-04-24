public class DeckOfCardsExtended {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] rankValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        int n = suits.length * ranks.length;
        Card[] deck = new Card[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = new Card(suits[j], ranks[i], rankValues[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            Card temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        CustomQueue<Player> playerQueue = new CustomQueue<>();
        for (int i = 1; i <= 4; i++) {
            playerQueue.enqueue(new Player("Player " + i));
        }

        int cardIndex = 0;
        CustomNode<Player> current = playerQueue.getHead();
        while (current != null) {
            Player player = current.data;
            for (int j = 0; j < 9; j++) {
                player.addCard(deck[cardIndex++]);
            }
            player.sortCardsByRank();
            current = current.next;
        }

        current = playerQueue.getHead();
        while (current != null) {
            current.data.printPlayerCards();
            current = current.next;
        }
    }
}
