package com.imc.figures;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class Figure {

    protected Set<FigureType> beatableBy;
    protected FigureType figureType;

    protected Figure(FigureType figureType, FigureType... beatableBy) {
        this.figureType = figureType;
        this.beatableBy = new HashSet<>();
        Collections.addAll(this.beatableBy, beatableBy);
    }

    public final boolean isBeated(Figure figure) {
        return beatableBy.contains(figure.getFigureType());
    }

    private FigureType getFigureType(){
        return figureType;
    }
}
