
package com.diceGame.players.botStrategies;

import com.diceGame.Decision;
import com.diceGame.GameContext;
import com.diceGame.players.Player;

public interface BotStrategy {
    Decision makeDecision(GameContext gameContext, Player me);
}
