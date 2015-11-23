package com.diceGame;/*
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

import java.util.Map;
import java.util.Set;

import com.diceGame.players.Player;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameContext {

    private Map<Player, Set<Dice>> diceCombinations;

    public Set<Dice> getDiceCombinationByPlayer(Player player) {
        if (diceCombinations.containsKey(player)) {
            return diceCombinations.get(player);
        } else {
            throw new IllegalArgumentException("Player does not exist.");
        }
    }
}
