package com.diceGame.players.botFactory;

import com.diceGame.botTypes.Game;
import com.diceGame.botTypes.Level;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class BotConfiguration {
    private Level level;
    private Game game;
}
