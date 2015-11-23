package com.diceGame.players;/*
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

import com.diceGame.Decision;
import com.diceGame.GameContext;
import com.diceGame.players.botStrategies.BotStrategy;

public class Bot implements Player {

    BotStrategy strategy;

    public Decision makeDecision(GameContext gameContext) {
        return strategy.makeDecision(gameContext);
    }
}