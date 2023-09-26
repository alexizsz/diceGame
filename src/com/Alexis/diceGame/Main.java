package com.Alexis.diceGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to DiceGame v.2!");
        System.out.println("Choose your name:");
        Scanner userReading = new Scanner(System.in);
        String userName = userReading.nextLine();
        System.out.println("Welcome " + userName);
        System.out.println("Make a selection in the menu:");
        System.out.println("1 - Start game");
        System.out.println("2 - Select amount of dices to be thrown");
        System.out.println("3 - Highscore?");
        System.out.println("4 - Exit the game!");

        int menuChoice = userReading.nextInt();
        switch (menuChoice) {
            case 1:
                Random newDiceThrow = new Random();

                System.out.println("Before the game starts - Choose amount of dices thrown up to 5: ");
                int thrownDices = userReading.nextInt();

                System.out.println("You have choosen: " + thrownDices + " too throw");
                System.out.println("The game will now start!");

                for (int i = 0; i <thrownDices; i++) {
                    diceThrowing newThrow = new diceThrowing((i),newDiceThrow.nextInt(1, 7));
                    System.out.println("You threw: " + newThrow.diceAmount);
                }
                break;
            case 2:
                System.out.println("How many dices do you want to throw?:");
                break;
            case 3:
                break;
            case 4:
                System.out.println("Thanks for playing!");
                break;
            default:
                System.out.println("You need to make a choice of 1-3!");
        }


    }
}