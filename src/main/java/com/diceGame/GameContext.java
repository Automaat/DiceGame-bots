package com.diceGame;

import java.util.List;
import java.util.Map;

import com.diceGame.players.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class GameContext {

    private Map<Player, List<Dice>> diceCombinations;
    private int desirableResult;

    public List<Dice> getDiceCombinationByPlayer(Player player) {
        if (diceCombinations.containsKey(player)) {
            return diceCombinations.get(player);
        } else {
            throw new IllegalArgumentException("Player does not exist.");
        }
    }
}
