package com.imc.players;

import com.imc.figures.FigureType;

import java.util.Random;

public class Computer implements Player {

    private final Random random;

    public Computer() {
        this.random = new Random();
    }

    @Override
    public FigureType makeMove() {
        return FigureType.get(random.nextInt(FigureType.values().length));
    }
}
