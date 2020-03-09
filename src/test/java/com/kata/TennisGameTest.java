package com.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Simple  TennisGame.
 */
public class TennisGameTest {

    private ScoreBoard scoreBoard;

    @Before
    public void setUp() {
        Player playerOne = new Player( "Nadal", 0 );
        Player playerTwo = new Player( "Federer", 0 );
        scoreBoard = new ScoreBoard( playerOne, playerTwo );
    }

    @Test
    public void scoreShouldBeLoveAllAtStartOfGame() {
        Assert.assertEquals( "Love All", scoreBoard.getGameScore() );
    }
}
