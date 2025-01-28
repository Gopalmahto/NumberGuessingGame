package com.jsp.numberguess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;

        //Generate a random number between 1 and 100;

        int numberToGuess = random.nextInt(upperBound-lowerBound+1);
        int attempts = 0;
        int maxAttempts =10;

        System.out.println("Welcome to Number Guessing game");
        System.out.println("I have selected a number between "+lowerBound+" and "+upperBound+". Can you guess it?");

        while (attempts<maxAttempts){
            System.out.println("Enter you Guess Number");
            int userGuess = sc.nextInt();
            attempts++;

            if (userGuess == numberToGuess){
                System.out.println("Congratulations! you've guessed the correct number in "+ attempts+ " attempts");
                break;
            } else if (userGuess<numberToGuess) {
                System.out.println("Try a higher Number");
            }
            else{
                System.out.println("Try a lower number");
            }
        }
        if (attempts==maxAttempts){
            System.out.println("Sorry , You've reached the maximum number of attempts. The Correct number was: "+ numberToGuess);

        }
        System.out.println("Thanks for playong");

    }

}
