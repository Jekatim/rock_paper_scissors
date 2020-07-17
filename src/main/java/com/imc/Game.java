package com.imc;

import com.imc.figures.FigureType;
import com.imc.players.Computer;
import com.imc.players.Human;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to Rock, Paper, Scissors game.");
        System.out.println("Enter your name:");

        Human human = new Human(scanner.nextLine());
        Computer computer = new Computer();

        System.out.println("How many rounds you want to play?");
        int cycles = -1;
        while (cycles < 0) {
            try {
                System.out.println("Please enter a integer number more then 0 and less then 2,147,483,647");
                input = scanner.nextLine();
                cycles = Integer.parseInt(input);
            } catch (NoSuchElementException | NumberFormatException e) {
                System.out.println("Wrong input.");
            }
        }

        int computerWins = 0;
        int humanWins = 0;
        for (int i = 0; i < cycles; i++) {
            System.out.println("\nRound " + (i + 1) + " begins!");
            FigureType humanFigure = human.makeMove();
            FigureType computerFigure = computer.makeMove();

            System.out.println("Your choice: " + humanFigure.getName());
            System.out.println("Computers' choice: " + computerFigure.getName());

            if (humanFigure == computerFigure) {
                System.out.println("It's a TIE!");
            } else if (humanFigure.getFigure().isBeated(computerFigure.getFigure())) {
                System.out.println("Computer WON! " + computerFigure.getName() + " beats " + humanFigure.getName());
                computerWins++;
            } else {
                System.out.println(human.getName() + " WON! " + humanFigure.getName() + " beats " + computerFigure.getName());
                humanWins++;
            }
        }

        System.out.println("\nGame ended with score:");
        System.out.println("Computer  " + computerWins + ":" + humanWins + "  " + human.getName());
    }
}
