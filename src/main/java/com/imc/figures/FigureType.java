package com.imc.figures;

import java.util.function.Supplier;

public enum FigureType {
    ROCK("Rock", Rock::new),
    PAPER("Paper", Paper::new),
    SCISSORS("Scissors", Scissors::new);

    private final String name;
    private final Supplier<Figure> supplier;

    FigureType(String name, Supplier<Figure> supplier) {
        this.name = name;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return supplier.get();
    }
}
