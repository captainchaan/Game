package ru.netology.stats;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);

    }

    public Player findByName(String playerName) {

        for (Player player : players) {
            if (player.getName() == playerName) {
                return player;
            }
        }
        throw new NotRegisteredException("Player with name " + playerName + " is not registered");
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = findByName(playerName1);
        Player player2 = findByName(playerName2);

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        if (player1.getStrength() < player2.getStrength()) {
            return 2;
        }
        return 0;
    }


}
