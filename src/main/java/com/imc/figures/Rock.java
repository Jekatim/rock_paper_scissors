package com.imc.figures;

public class Rock extends Figure{

    public Rock() {
        super(FigureType.PAPER);
    }

    @Override
    protected FigureType getFigureType() {
        return FigureType.ROCK;
    }
}
