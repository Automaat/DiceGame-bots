package com.diceGame.players.botFactory;

import java.util.HashMap;
import java.util.Map;

import com.diceGame.botTypes.Game;
import com.diceGame.botTypes.Level;
import com.diceGame.players.Bot;
import com.diceGame.players.botStrategies.BotStrategy;
import com.diceGame.players.botStrategies.NPlusStrategy;

public class BotFactory {
    private static final Map<BotConfiguration, BotStrategy> strategies = new HashMap<BotConfiguration, BotStrategy>() {
        {
            put(new BotConfiguration(Level.EASY, Game.N_PLUS), new NPlusStrategy());
        }
    };

    public static Bot createBot(Level level, Game game) {
        BotConfiguration botConfiguration = new BotConfiguration(level, game);
        return new Bot(strategies.get(botConfiguration));
    }
}
