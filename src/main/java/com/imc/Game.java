package com.imc;

import com.imc.figures.FigureType;
import com.imc.players.Computer;
import com.imc.players.Human;
import com.imc.players.Player;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors game.");

        Human human = new Human(scanner);
        Computer computer = new Computer();

        System.out.println("How many rounds you want to play?");
        int cycles = -1;
        while (cycles < 0) {
            try {
                System.out.println("Please enter a integer number more then 0 and less then 2,147,483,647");
                String input = scanner.nextLine();
                cycles = Integer.parseInt(input);
            } catch (NoSuchElementException | NumberFormatException e) {
                System.out.println("Wrong input.");
            }
        }

        playGame(human, computer, cycles);
    }

    public static void playGame(Player player1, Player player2, int roundsToPlay) {
        System.out.println(player1.getName() + " vs " + player2.getName());
        int player1Wins = 0;
        int player2Wins = 0;
        for (int i = 0; i < roundsToPlay; i++) {
            System.out.println("\nRound " + (i + 1) + " begins!");
            FigureType player1Figure = player1.makeMove();
            FigureType player2Figure = player2.makeMove();

            System.out.println(player1.getName() + " choice: " + player1Figure.getName());
            System.out.println(player2.getName() + " choice: " + player2Figure.getName());

            if (player1Figure == player2Figure) {
                System.out.println("It's a TIE!");
            } else if (player1Figure.getFigure().isBeated(player2Figure.getFigure())) {
                System.out.println(player2.getName() + " WON! " + player2Figure.getName() + " beats " + player1Figure.getName());
                player2Wins++;
            } else {
                System.out.println(player1.getName() + " WON! " + player1Figure.getName() + " beats " + player2Figure.getName());
                player1Wins++;
            }
        }

        System.out.println("\nGame ended with score:");
        System.out.println(player1.getName() + "  " + player1Wins + ":" + player2Wins + "  " + player2.getName());
    }
}
