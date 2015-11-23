/*
 * Copyright (c) 2015 by Sabre Holdings Corp.
 * 3150 Sabre Drive, Southlake, TX 76092 USA
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Sabre Holdings Corporation ("Confidential Information").
 * You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement
 * you entered into with Sabre Holdings Corporation.
 */
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
