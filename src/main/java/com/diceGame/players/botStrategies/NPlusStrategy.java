package com.diceGame.players.botStrategies;

import static java.lang.Math.ceil;
import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.List;

import com.diceGame.Decision;
import com.diceGame.Dice;
import com.diceGame.GameContext;
import com.diceGame.players.Player;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NPlusStrategy implements BotStrategy {

    public static final int FIRST_ELEMENT = 0;

    public Decision makeDecision(GameContext gameContext, Player me) {
        List<Dice> dices = gameContext.getDiceCombinationByPlayer(me);

        Integer onHandSum = dices.stream().mapToInt(Dice::getValue).sum();

        int toReroll = numberToReroll(gameContext, onHandSum);

        List<Dice> dicesToReroll;

        if (toReroll == 0) {
            dicesToReroll = emptyList();
        } else if (toReroll > 0) {
            dicesToReroll = tryToGetBiggerSum(dices, toReroll);
        } else {
            dicesToReroll = tryToGetLowerSum(dices, toReroll);
        }

        return new Decision(dicesToReroll);
    }

    private List<Dice> tryToGetLowerSum(List<Dice> dices, int toReroll) {
        toReroll = -toReroll;
        List<Dice> dicesToReroll = new ArrayList<>(toReroll);
        for (int i = 0; i < toReroll; i++) {
            Dice bestCadidate = dices.get(FIRST_ELEMENT);
            for (Dice dice : dices) {
                if ((dice.getValue() - 1) > (bestCadidate.getValue() - 1)) {
                    bestCadidate = dice;
                }
            }
            dicesToReroll.add(bestCadidate);
            dices.remove(bestCadidate);
        }
        return dicesToReroll;
    }

    private List<Dice> tryToGetBiggerSum(List<Dice> dices, int toReroll) {
        List<Dice> dicesToReroll = new ArrayList<>(toReroll);
        for (int i = 0; i < toReroll; i++) {
            Dice bestCadidate = dices.get(FIRST_ELEMENT);
            for (Dice dice : dices) {
                if ((6 - dice.getValue()) > (6 - bestCadidate.getValue())) {
                    bestCadidate = dice;
                }
            }
            dicesToReroll.add(bestCadidate);
            dices.remove(bestCadidate);
        }
        return dicesToReroll;
    }

    private int numberToReroll(GameContext gameContext, Integer onHandSum) {
        double toReroll = (gameContext.getDesirableResult() - onHandSum) / 6.0;
        if (toReroll > 0) {
            return (int) ceil(toReroll);
        } else {
            return (int) Math.floor(toReroll);
        }

    }

}
