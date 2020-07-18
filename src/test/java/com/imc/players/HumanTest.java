package com.imc.players;

import com.imc.figures.FigureType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {

    private ByteArrayInputStream inContent;
    private static final InputStream originalIn = System.in;

    @BeforeAll
    static void setUpStreams() {
    }

    @AfterAll
    static void restoreStreams() {
        System.setIn(originalIn);
    }

    @Test
    public void humanTest() {
        sendInput("TestUser\nr");
        Scanner scanner = new Scanner(inContent);
        Human human = new Human(scanner);

        FigureType figureType = human.makeMove();
        assertEquals(figureType, FigureType.ROCK);

        sendInput("TestUser\nP");
        scanner = new Scanner(inContent);
        human = new Human(scanner);

        figureType = human.makeMove();
        assertEquals(figureType, FigureType.PAPER);

        sendInput("TestUser\nScissors");
        scanner = new Scanner(inContent);
        human = new Human(scanner);

        figureType = human.makeMove();
        assertEquals(figureType, FigureType.SCISSORS);
    }

    private void sendInput(String line) {
        inContent = new ByteArrayInputStream(line.getBytes());
        System.setIn(inContent);
    }

}