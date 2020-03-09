package com.kata;

public class ScoreBoard {

    private Player playerOne;
    private Player playerTwo;
    private String score = "Love All";

    public ScoreBoard(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getGameScore() {

        if (playerOne.getPointScore() == playerTwo.getPointScore())
            score = translateScore( playerOne.getPointScore() ) + " " + "All";
        else if (isPlayerTwoWinner())
            score = playerTwo.getName() + " " + "Wins";
        else
            score = translateScore( playerOne.getPointScore() ) + " " + translateScore( playerTwo.getPointScore() );
        return score;
    }

    private Boolean isPlayerTwoWinner() {
        return (playerTwo.getPointScore() > 3 && playerTwo.getPointScore() > playerOne.getPointScore() + 1);
    }
    private TennisPoints translateScore(int pointScore) {
        switch (pointScore) {
            case 3:
                return TennisPoints.Forty;
            case 2:
                return TennisPoints.Thirty;
            case 1:
                return TennisPoints.Fifteen;
            case 0:
                return TennisPoints.Love;
        }
        throw new IllegalArgumentException( "Invalid pointScore: " + pointScore );
    }
}
