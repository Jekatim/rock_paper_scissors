package com.imc.figures;

public class Paper extends Figure{

    public Paper() {
        super(FigureType.SCISSORS);
    }

    @Override
    protected FigureType getFigureType() {
        return FigureType.PAPER;
    }
}
