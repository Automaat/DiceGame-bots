package com.diceGame.players;

import com.diceGame.Decision;
import com.diceGame.GameContext;

public interface Player {

    Decision makeDecision(GameContext gameContext);
}
