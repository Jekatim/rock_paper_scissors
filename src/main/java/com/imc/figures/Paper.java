package com.imc.figures;

public class Paper extends Figure {

    private static final Paper INSTANCE = new Paper();

    private Paper() {
        super(FigureType.PAPER, FigureType.SCISSORS);
    }

    public static Paper getInstance() {
        return INSTANCE;
    }
}
