package com.kata;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Simple  TennisGame.
 */
public class TennisGameTest {

    @Test
    public void scoreShouldBeLoveAllAtStartOfGame() {
        Player playerOne = new Player( "Nadal", 0 );
        Player playerTwo = new Player( "Federer", 0 );
        ScoreBoard scoreBoard = new ScoreBoard( playerOne, playerTwo );
        Assert.assertEquals( "Love All", scoreBoard.getGameScore() );
    }
}
