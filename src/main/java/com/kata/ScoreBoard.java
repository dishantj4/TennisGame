package com.kata;

public class ScoreBoard {

    private Player playerOne;
    private Player playerTwo;
    private String score;

    public ScoreBoard(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getGameScore() {

        if (playerOne.getPointScore() == 0 && playerTwo.getPointScore() == 0)
            score = "Love All";

        return score;
    }
}
