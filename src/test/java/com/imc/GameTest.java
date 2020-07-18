package com.imc;

import com.imc.figures.FigureType;
import com.imc.players.TestPlayer;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void tieTest() {
        TestPlayer player1 = new TestPlayer("TestPlayer", FigureType.ROCK);
        TestPlayer player2 = new TestPlayer("TestPlayer", FigureType.ROCK);

        Game.playGame(player1, player2, 1);
        assertTrue(outContent.toString().contains("TIE"));
    }

    @Test
    void winTest() {
        TestPlayer player1 = new TestPlayer("TestPlayer1", FigureType.ROCK);
        TestPlayer player2 = new TestPlayer("TestPlayer2", FigureType.PAPER);

        Game.playGame(player1, player2, 1);
        assertTrue(outContent.toString().contains("TestPlayer2 WON! Paper beats Rock"));
    }
}