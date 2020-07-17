package com.imc.players;

import com.imc.figures.FigureType;

public class Computer implements Player {

    private final NumberProvider numberProvider;

    public Computer(NumberProvider numberProvider) {
        this.numberProvider = numberProvider;
    }

    @Override
    public FigureType makeMove() {
        switch (numberProvider.get()) {
            case 0:
                return FigureType.ROCK;
            case 1:
                return FigureType.PAPER;
            case 2:
                return FigureType.SCISSORS;
            default:
                return null;
        }
    }

    public interface NumberProvider {
        int get();
    }
}
