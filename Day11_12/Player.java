public class Player {
    private String name;
    private CustomQueue<Card> cardsQueue;

    public Player(String name) {
        this.name = name;
        this.cardsQueue = new CustomQueue<>();
    }

    public void addCard(Card card) {
        cardsQueue.enqueue(card);
    }

    public void sortCardsByRank() {
        int size = cardsQueue.getSize();
        if (size == 0) return;

        Card[] cardsArray = new Card[size];
        for (int i = 0; i < size; i++) {
            cardsArray[i] = cardsQueue.dequeue();
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (cardsArray[j].getRankValue() > cardsArray[j + 1].getRankValue()) {
                    Card temp = cardsArray[j];
                    cardsArray[j] = cardsArray[j + 1];
                    cardsArray[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            cardsQueue.enqueue(cardsArray[i]);
        }
    }

    public String getName() {
        return name;
    }

    public CustomQueue<Card> getCardsQueue() {
        return cardsQueue;
    }

    public void printPlayerCards() {
        System.out.println(name + " cards:");
        CustomNode<Card> current = cardsQueue.getHead();
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
        System.out.println();
    }
}
