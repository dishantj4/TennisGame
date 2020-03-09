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
}
