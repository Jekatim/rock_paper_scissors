package com.imc.figures;

public class Paper extends Figure {

    private static final Paper INSTANCE = new Paper();

    public Paper() {
        super(FigureType.PAPER, FigureType.SCISSORS);
    }

    public static Paper getInstance() {
        return INSTANCE;
    }
}
