package com.diceGame.players.botStrategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.diceGame.Decision;
import com.diceGame.Dice;
import com.diceGame.GameContext;
import com.diceGame.botTypes.Game;
import com.diceGame.botTypes.Level;
import com.diceGame.players.Player;
import com.diceGame.players.botFactory.BotFactory;
import org.junit.Assert;
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
        List<Dice> startingHand = createStartingHand(1, 2, 3, 4, 5, 6);
        GameContext gameContext = createGameContext(bot, startingHand, 25);
        Decision expectedDecision = createDecision(1);

        //when
        Decision decision = bot.makeDecision(gameContext);

        //then
        Assert.assertEquals(decision, expectedDecision);
    }

    private Decision createDecision(int... toReroll) {
        List<Dice> dicesToReroll = new ArrayList<>();
        for (int diceValue : toReroll) {
            dicesToReroll.add(new Dice(diceValue));
        }
        return new Decision(dicesToReroll);
    }

    private GameContext createGameContext(Player bot, List<Dice> startingHand, int desirableResult) {
        Map<Player, List<Dice>> playersMap = new HashMap<>();
        playersMap.put(bot, startingHand);
        return new GameContext(playersMap, desirableResult);
    }

    private List<Dice> createStartingHand(int... numbersOfPoints) {

        List<Dice> startingHand = new ArrayList<>();
        for (int points : numbersOfPoints) {
            startingHand.add(new Dice(points));
        }
        return startingHand;
    }
}