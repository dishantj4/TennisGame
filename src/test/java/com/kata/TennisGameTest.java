package com.kata;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Unit test for Simple  TennisGame.
 */
public class TennisGameTest {

    private ScoreBoard scoreBoard;
    private Player playerOne;
    private Player playerTwo;

    @Before
    public void setUp() {
        playerOne = new Player( "Nadal", 0 );
        playerTwo = new Player( "Federer", 0 );
        scoreBoard = new ScoreBoard( playerOne, playerTwo );
    }

    @Test
    public void scoreShouldBeLoveAllAtStartOfGame() {
        assertEquals( "Love All", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBeLoveFifteenWhenPlayerTwoScoresFirstPoint() {
        playerTwo.setPointScore( 1 );
        assertEquals( "Love Fifteen", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBeLoveThirtyWhenPlayerTwoScoresSecondPoint() {
        playerTwo.setPointScore( 2 );
        assertEquals( "Love Thirty", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBeLoveFortyWhenPlayerTwoScoresThirdPoint() {
        playerTwo.setPointScore( 3 );
        assertEquals( "Love Forty", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBePlayerTwoWinsWhenPlayerTwoScoresFourthPoint() {
        playerTwo.setPointScore( 4 );
        assertEquals( "Federer Wins", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBeFifteenAllWhenBothPlayerHasSoredOnePointEach() {
        playerOne.setPointScore( 1 );
        playerTwo.setPointScore( 1 );
        assertEquals( "Fifteen All", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBeDeuceWhenBothPlayerHasSoredThreePointEach() {
        playerOne.setPointScore( 3 );
        playerTwo.setPointScore( 3 );
        assertEquals( "Deuce", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBePlayerOneAdvantageWhenPlayerOneScoresPointPostDeuce() {
        playerOne.setPointScore( 4 );
        playerTwo.setPointScore( 3 );
        assertEquals( "Nadal Advantage", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBePlayerTwoAdvantageWhenPlayerTwoScoresPointPostDeuce() {
        playerOne.setPointScore( 3 );
        playerTwo.setPointScore( 4 );
        assertEquals( "Federer Advantage", scoreBoard.getGameScore() );
    }

    @Test
    public void scoreShouldBePlayerOneWinsWhenPlayerOneScoresConsecutivePointsPostDeuce() {
        playerOne.setPointScore( 5 );
        playerTwo.setPointScore( 3 );
        assertEquals( "Nadal Wins", scoreBoard.getGameScore() );
    }
}
