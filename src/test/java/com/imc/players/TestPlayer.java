package com.imc.players;

import com.imc.figures.FigureType;

public class TestPlayer implements Player {

    private final FigureType figureTypeToReturn;
    private final String name;

    public TestPlayer(String name, FigureType figureTypeToReturn) {
        this.name = name;
        this.figureTypeToReturn = figureTypeToReturn;
    }

    @Override
    public FigureType makeMove() {
        return figureTypeToReturn;
    }

    @Override
    public String getName() {
        return name;
    }
}
