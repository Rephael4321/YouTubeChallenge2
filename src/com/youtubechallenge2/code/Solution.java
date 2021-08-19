package com.youtubechallenge2.code;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Show a welcome message
        // Ask the User's name and say hello to the user
        System.out.println("Welcome! \nPlease Enter Your Name");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("Hello " + answer);

        // Ask if we should start the game
        System.out.println("Shall we start the game? (Type y for Yes or n for No)");
        answer = scanner.next();

        if (answer.equals("N") || answer.equals("n")) {
            System.out.println("Exiting...");
            System.exit(0);
        } else if (!answer.equals("Y") && !answer.equals("y")) {
            System.out.println("Incorrect input");
            System.exit(-1);
        }

        // After receiving a positive answer generate a random number and ask the user's guess
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        System.out.println("Please guess the number (between 1 to 10 including)");
        short guesses = 0;
        int guess;

        do {
            guess = scanner.nextInt();
            // If the guess is correct show a congratulation message and quit the game
            if (guess == number) {
                System.out.println("Well done! That is the correct number");
                System.exit(0);
            // If the number is not correct, ask again until you receive the correct answer
            // As a hint, beside the first time, every time that you are asking for a number, tell the user to guess
            // higher or lower
            } else if (guess < number) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
            guesses++;

        } while (guesses < 5);

        // If the user failed 5 times, show a game over message and quit the game
        System.out.println("Game over");
    }
}
