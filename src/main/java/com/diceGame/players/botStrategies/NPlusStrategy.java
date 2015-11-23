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
package com.diceGame.players.botStrategies;

import java.util.Set;

import com.diceGame.Decision;
import com.diceGame.Dice;
import com.diceGame.GameContext;
import com.diceGame.players.Player;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NPlusStrategy implements BotStrategy {

    public Decision makeDecision(GameContext gameContext, Player me) {
        Set<Dice> dices = gameContext.getDiceCombinationByPlayer(me);
        System.out.println(dices.toString());
        return null;
    }
}
