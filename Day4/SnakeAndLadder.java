import java.util.Random;

public class SnakeAndLadder {
    private static final int START = 0;
    private static final int WIN = 100;
    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;

    public static void main(String[] args) {
        System.out.println("Snake and Ladder");

        GameResult single = playSinglePlayer();
        System.out.println("Single Player - Dice rolled: " + single.totalRolls);

        TwoPlayerResult two = playTwoPlayers();
        System.out.println("Two Player - Winner: Player " + two.winnerPlayer);
        System.out.println("Two Player - Total dice rolled: " + two.totalRolls);
    }

    private static GameResult playSinglePlayer() {
        Random random = new Random();
        int position = START;
        int rolls = 0;

        while (position != WIN) {
            int die = rollDie(random);
            int option = random.nextInt(3);
            int next = applyMove(position, die, option);
            rolls++;
            position = next;
            System.out.println("P1 Roll " + rolls + " -> die=" + die + ", option=" + optionName(option) + ", position=" + position);
        }

        return new GameResult(rolls);
    }

    private static TwoPlayerResult playTwoPlayers() {
        Random random = new Random();
        int[] pos = {START, START};
        int current = 0;
        int rolls = 0;

        while (pos[0] != WIN && pos[1] != WIN) {
            int die = rollDie(random);
            int option = random.nextInt(3);
            int before = pos[current];
            int after = applyMove(before, die, option);
            rolls++;
            pos[current] = after;

            System.out.println("P" + (current + 1) + " Roll " + rolls + " -> die=" + die + ", option=" + optionName(option) + ", position=" + after);

            if (after == WIN) break;
            if (option != LADDER) current = 1 - current;
        }

        int winner = pos[0] == WIN ? 1 : 2;
        return new TwoPlayerResult(winner, rolls);
    }

    private static int rollDie(Random random) {
        return random.nextInt(6) + 1;
    }

    private static int applyMove(int position, int die, int option) {
        int next = position;

        if (option == NO_PLAY) {
            next = position;
        } else if (option == LADDER) {
            next = position + die;
        } else if (option == SNAKE) {
            next = position - die;
        }

        if (next < START) next = START;
        if (next > WIN) next = position;
        return next;
    }

    private static String optionName(int option) {
        return switch (option) {
            case NO_PLAY -> "NO_PLAY";
            case LADDER -> "LADDER";
            case SNAKE -> "SNAKE";
            default -> "UNKNOWN";
        };
    }

    private record GameResult(int totalRolls) {}
    private record TwoPlayerResult(int winnerPlayer, int totalRolls) {}
}

