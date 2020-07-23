package com.imc.figures;

public class Rock extends Figure {

    private static final Rock INSTANCE = new Rock();

    private Rock() {
        super(FigureType.ROCK, FigureType.PAPER);
    }

    public static Rock getInstance() {
        return INSTANCE;
    }
}
