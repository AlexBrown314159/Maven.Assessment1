package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String result = "";

        if (handSign == "rock") {
            result = "paper";
        }

        if (handSign == "scissor") {
            result = "rock";
        }

        if (handSign == "paper") {
            result = "scissor";
        }

            return result;
    }


    // Rock loses to paper and wins to scissors,
    // paper loses to scissors and wins to rock, and
    // scissors lose to rock and win to paper



    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String result = "";

        if (handSign == "rock") {
            result = "scissor";
        }

        if (handSign == "scissor") {
            result = "paper";
        }

        if (handSign == "paper") {
            result = "rock";
        }

        return result;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {






        return null;
    }
}
