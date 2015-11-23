import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.diceGame.Dice;
import com.diceGame.GameContext;
import com.diceGame.botTypes.Game;
import com.diceGame.botTypes.Level;
import com.diceGame.players.Player;
import com.diceGame.players.botFactory.BotFactory;

public class Main {

    public static final int ANY_DESIRABLE_RESULT = 20;

    public static void main(String[] args) {
        Player firstBot = BotFactory.createBot(Level.EASY, Game.N_PLUS);
        List<Dice> dices = new LinkedList<>();
        dices.add(new Dice(5));
        Map<Player, List<Dice>> players = new HashMap<>();
        players.put(firstBot, dices);
        GameContext gameContext = new GameContext(players, ANY_DESIRABLE_RESULT);

        firstBot.makeDecision(gameContext);

    }
}
