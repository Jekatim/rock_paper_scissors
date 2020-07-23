package com.imc.figures;

public class Scissors extends Figure {

    private static final Scissors INSTANCE = new Scissors();

    private Scissors() {
        super(FigureType.SCISSORS, FigureType.ROCK);
    }

    public static Scissors getInstance() {
        return INSTANCE;
    }
}
