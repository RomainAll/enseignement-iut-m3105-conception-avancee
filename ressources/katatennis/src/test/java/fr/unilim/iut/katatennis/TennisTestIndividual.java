package fr.unilim.iut.katatennis;

import org.junit.Test;
import static org.junit.Assert.*;

public class TennisTestIndividual {

    @Test
    public void at_the_beginning_of_the_game_the_score_is_love_All() {
        TennisGame tennisGame = new TennisGame1("alice", "bob");
        String score = tennisGame.getScore();
        assertEquals("Love-All", score);
    }

    @Test
    public void when_player1_wonOnePoint_then_the_score_is_Fifteen_love() {
        TennisGame tennisGame = new TennisGame1("player1", "player2");
        tennisGame.wonPoint("player1");
        String score = tennisGame.getScore();
        assertEquals("Fifteen-Love", score);
    }

    @Test
    public void when_player1_wonOnePoint_then_the_score_is_Fifteen_All() {
        TennisGame tennisGame = new TennisGame1("player1", "player2");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        String score = tennisGame.getScore();
        assertEquals("Fifteen-All", score);
    }

    @Test
    public void when_player1_wonOnePoint_then_the_score_is_Thirty_Fifteen() {
        TennisGame tennisGame = new TennisGame1("player1", "player2");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        String score = tennisGame.getScore();
        assertEquals("Thirty-Fifteen", score);
    }
}
