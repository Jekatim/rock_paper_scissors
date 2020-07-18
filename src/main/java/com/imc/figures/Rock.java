package com.imc.figures;

public class Rock extends Figure {

    private static final Rock INSTANCE = new Rock();

    public Rock() {
        super(FigureType.ROCK, FigureType.PAPER);
    }

    public static Rock getInstance() {
        return INSTANCE;
    }
}
