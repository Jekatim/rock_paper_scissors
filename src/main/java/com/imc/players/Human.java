package com.imc.players;

import com.imc.figures.FigureType;

import java.util.Scanner;

public class Human implements Player {

    private final Scanner scanner;
    private final String name;

    public Human(Scanner scanner) {
        System.out.println("Enter your name:");
        this.name = scanner.nextLine();
        this.scanner = scanner;
    }

    @Override
    public FigureType makeMove() {
        FigureType figureType = null;
        while (figureType == null) {
            System.out.println("Please enter you move: R|r for rock, P|p for paper or S|s for scissors");
            String input = scanner.nextLine();
            if (!input.isEmpty()) {
                if (input.toLowerCase().startsWith("r")) {
                    figureType = FigureType.ROCK;
                } else if (input.toLowerCase().startsWith("p")) {
                    figureType = FigureType.PAPER;
                } else if (input.toLowerCase().startsWith("s")) {
                    figureType = FigureType.SCISSORS;
                } else {
                    System.out.println("Sorry, I don't understand that. Please try again.");
                }
            } else {
                System.out.println("Sorry, your input is empty. Please try again.");
            }
        }

        return figureType;
    }

    @Override
    public String getName() {
        return name;
    }
}
