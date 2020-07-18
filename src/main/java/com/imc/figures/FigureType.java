package com.imc.figures;

import java.util.function.Supplier;

public enum FigureType {
    ROCK("Rock", Rock::getInstance),
    PAPER("Paper", Paper::getInstance),
    SCISSORS("Scissors", Scissors::getInstance);

    private static final FigureType[] values = values();

    private final String name;
    private final Supplier<Figure> figureSupplier;

    FigureType(String name, Supplier<Figure> figureSupplier) {
        this.name = name;
        this.figureSupplier = figureSupplier;
    }

    public static FigureType get(int ordinal) { return values[ordinal]; }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figureSupplier.get();
    }
}
