package com.Alexis.diceGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userReading = new Scanner(System.in);

        System.out.println("Welcome to DiceGame v.2!");
        System.out.println("Choose your name:");
        String userName = userReading.nextLine();
        System.out.println("Welcome " + userName);
        System.out.println("Press < 1 > to Start game");

        int menuChoice = userReading.nextInt();
        switch (menuChoice) {
            case 1:
                Random newDiceThrow = new Random();

                System.out.println("Before the game starts - Choose amount of dices thrown up to 5: ");
                int dicesAmount = userReading.nextInt();

                System.out.println("You have choosen: " + dicesAmount + " too throw");
                System.out.println("The game will now start!");

                for (int i = 0; i <dicesAmount; i++) {
                    diceThrowing newThrow = new diceThrowing((i),newDiceThrow.nextInt(1, 7));
                    System.out.println("You threw: " + newThrow.diceAmount);
                }
                break;
            default:
                System.out.println("You need to make a choice of 1-3!");
                break;
        }


    }
}