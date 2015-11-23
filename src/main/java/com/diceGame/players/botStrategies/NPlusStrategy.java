
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
