package com.diceGame.players;

import java.util.Set;

import com.diceGame.Decision;
import com.diceGame.Dice;
import com.diceGame.GameContext;

public class NPlusBot extends Bot {


    public Decision makeDecision(GameContext gameContext) {
        Set<Dice> dices = gameContext.getDiceCombinationByPlayer(this);
        System.out.println(dices.toString());
        return null;
    }
}
