package com.kata;

public class ScoreBoard {

    private Player playerOne;
    private Player playerTwo;
    private String score = "Love All";
    private static final String SPACE = " ";
    private static final String ALL = "All";
    private static final String WINS = "Wins";

    public ScoreBoard(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getGameScore() {


        if (isDeuce())
            score = String.valueOf( TennisPoints.Deuce );
        else if (isPlayerTwoWinner())
            score = playerTwo.getName() + SPACE + WINS;
        else if (isPlayerOneWinner())
            score = playerOne.getName() + SPACE + WINS;
        else if (hasAdvantage())
            return advantagePlayerName() + " " + TennisPoints.Advantage;
        else if (playerOne.getPointScore() == playerTwo.getPointScore())
            score = translateScore( playerOne.getPointScore() ) + SPACE + ALL;
        else
            score = translateScore( playerOne.getPointScore() ) + SPACE + translateScore( playerTwo.getPointScore() );
        return score;
    }

    private Boolean isPlayerTwoWinner() {
        return (playerTwo.getPointScore() > 3 && playerTwo.getPointScore() > playerOne.getPointScore() + 1);
    }

    private Boolean isPlayerOneWinner() {
        return (playerOne.getPointScore() > 3 && playerOne.getPointScore() > playerTwo.getPointScore() + 1);
    }

    private Boolean isDeuce() {
        return (playerTwo.getPointScore() > 2 && playerTwo.getPointScore() == playerOne.getPointScore());
    }

    private Boolean playerOneHasAdvantage() {
        return hasPointScoreMoreThanForty() && playerOne.getPointScore() > playerTwo.getPointScore();
    }

    private Boolean playerTwoHasAdvantage() {
        return hasPointScoreMoreThanForty() && playerOne.getPointScore() < playerTwo.getPointScore();
    }

    private Boolean hasAdvantage() {
        return playerOneHasAdvantage() || playerTwoHasAdvantage();
    }

    private String advantagePlayerName() {
        if (playerOneHasAdvantage())
            return playerOne.getName();
        else
            return playerTwo.getName();
    }

    private Boolean hasPointScoreMoreThanForty() {
        return playerOne.getPointScore() > 2 && playerTwo.getPointScore() > 2;
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
