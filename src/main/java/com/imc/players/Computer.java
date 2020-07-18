package com.imc.players;

import com.imc.figures.FigureType;

import java.util.Random;

public class Computer implements Player {

    private final Random random;
    private final String name;

    public Computer() {
        this.random = new Random();
        this.name = "Computer" + System.nanoTime();
    }

    @Override
    public FigureType makeMove() {
        return FigureType.get(random.nextInt(FigureType.values().length));
    }

    @Override
    public String getName() {
        return name;
    }
}
