package com.imc.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    private final static Rock ROCK = new Rock();
    private final static Paper PAPER = new Paper();
    private final static Scissors SCISSORS = new Scissors();

    @Test
    void fightLogic(){
        assertTrue(SCISSORS.isBeated(ROCK));
        assertTrue(ROCK.isBeated(PAPER));
        assertTrue(PAPER.isBeated(SCISSORS));
    }

    @Test
    void backtrack() {
        for (FigureType type : FigureType.values()) {
            assertEquals(type, type.getFigure().figureType);
        }
    }
}