package com.diceGame;
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
