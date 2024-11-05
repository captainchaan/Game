package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game game = new Game();


    @Test
    public void NotRegistredException() {
        Player player1 = new Player(1, "Андрей", 500);


        game.register(player1);


        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Андрей", "Петя");
        });
    }

    @Test
    public void NotRegistredException1() {
        Player player2 = new Player(1, "Костя", 200);


        game.register(player2);


        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Андрей", "Костя");
        });
    }

    @Test
    public void NotRegistredException2() {
        Player player1 = new Player(1, "Андрей", 500);
        Player player2 = new Player(1, "Костя", 200);


        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Андрей", "Костя");
        });
    }

    @Test
    public void round1() {
        Player player1 = new Player(1, "Андрей", 500);
        Player player2 = new Player(1, "Костя", 200);

        game.register(player1);
        game.register(player2);

        Assertions.assertEquals(1, game.round("Андрей", "Костя"));

    }

    @Test
    public void round2() {
        Player player1 = new Player(1, "Андрей", 200);
        Player player2 = new Player(1, "Костя", 500);

        game.register(player1);
        game.register(player2);

        Assertions.assertEquals(2, game.round("Андрей", "Костя"));

    }

    @Test
    public void round3() {
        Player player1 = new Player(1, "Андрей", 200);
        Player player2 = new Player(1, "Костя", 200);

        game.register(player1);
        game.register(player2);

        Assertions.assertEquals(0, game.round("Андрей", "Костя"));

    }


}

