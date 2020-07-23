package com.imc.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    private final static Rock ROCK = Rock.getInstance();
    private final static Paper PAPER = Paper.getInstance();
    private final static Scissors SCISSORS = Scissors.getInstance();

    @Test
    void fightLogicTest(){
        assertTrue(SCISSORS.isBeated(ROCK));
        assertTrue(ROCK.isBeated(PAPER));
        assertTrue(PAPER.isBeated(SCISSORS));
    }

    @Test
    void backtrackTest() {
        for (FigureType type : FigureType.values()) {
            assertEquals(type, type.getFigure().figureType);
        }
    }
}