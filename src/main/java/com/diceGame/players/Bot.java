package com.diceGame.players;

import com.diceGame.Decision;
import com.diceGame.GameContext;
import com.diceGame.players.botStrategies.BotStrategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bot implements Player {

    BotStrategy strategy;

    public Decision makeDecision(GameContext gameContext) {
        return strategy.makeDecision(gameContext, this);
    }
}
