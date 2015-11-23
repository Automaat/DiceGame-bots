package com.diceGame.players.botStrategies;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.diceGame.Dice;
import com.diceGame.GameContext;
import com.diceGame.botTypes.Game;
import com.diceGame.botTypes.Level;
import com.diceGame.players.Player;
import com.diceGame.players.botFactory.BotFactory;
import org.junit.Before;
import org.junit.Test;

public class NPlusStrategyTest {

    private Player bot;

    @Before
    public void setUp() throws Exception {
        bot = BotFactory.createBot(Level.EASY, Game.N_PLUS);
    }

    @Test
    public void testMakeDecision() throws Exception {
        //given
        Set<Dice> startingHand = createStartingHand(1, 2, 3, 4, 5);
        GameContext gameContext = createGameContext(bot, startingHand, 20);

        //when

        //then
    }

    private GameContext createGameContext(Player bot, Set<Dice> startingHand, int desirableResult) {
        Map<Player, Set<Dice>> playersMap = new HashMap<Player, Set<Dice>>();
        playersMap.put(bot, startingHand);
        return new GameContext(playersMap, desirableResult);
    }

    private Set<Dice> createStartingHand(int... numbersOfPoints) {

        Set<Dice> startingHand = new HashSet<Dice>();
        for (int points : numbersOfPoints) {
            startingHand.add(new Dice(points));
        }
        return startingHand;
    }
}