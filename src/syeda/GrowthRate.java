/*
* Course: CSC1110 - 111
* Fall 2024
* Lab 5 - Growth Rates
* Name: Ameera Syed
* Created: 10/02/2024

This program represents the amount of money received yearly.
The player is able to receive it linearly, receiving the same amount yearly
or exponentially, doubling each year. They will input this.
The program compares the amount received per year, until they eventually retire.
It will then represent how many years you worked and also will display
whether linear or exponential growth was better.
The player may also run this several times
 */

package syeda;

import java.util.Scanner;

public class GrowthRate {
    public static void main(String[] args) {
        boolean inGame = true;

        //Loops until player no longer wants to play
        while (inGame) {
            long startCurrency = Math.round(Math.random() * 7000) + 1000;
            story(startCurrency);

            // Declarations
            String playAgain = "";
            int playerChoice = -1;
            int currChoice;
            Scanner in = new Scanner(System.in);

            // Linear or exponential growth option for player and validations
            printInput(startCurrency);
            while (playerChoice != 1 && playerChoice != 2) {
                if (in.hasNextInt()) {
                    currChoice = in.nextInt();
                    if (currChoice != 1 && currChoice != 2) {
                        System.out.println("Invalid input. Try again. ");
                        printInput(startCurrency);
                    }else{
                        playerChoice = currChoice;
                    }
                } else {
                    System.out.println("Invalid input. Try again. ");
                    printInput(startCurrency);
                    in.next();
                }
            }

            //Calculates and prints table with years, linear, and exponential
            long years = Math.round(Math.random() * 40 + 1);
            long expoCurrency = 0;
            long currency = startCurrency;
            boolean printOnce = false;
            System.out.println("\nTotal money received after N years");
            System.out.println("===================================");
            for (int i = 1; i < years +1; i ++){
                currency = i * startCurrency;
                expoCurrency = 2*expoCurrency + 1;
                if (expoCurrency < currency ) {
                  System.out.printf("Year: %d    Linear: %d    Exponential: %d\n",i,currency,expoCurrency);
                }else if (!printOnce){
                    System.out.printf("Year: %d    Linear: %d    Exponential: %d\n",i,currency,expoCurrency);
                    printOnce = true;
                }
            }

            // Prints final conclusion of calculations, including how much money the player made extra or would have lost
            // This is based on whether the player chose linear or exponential
            if (currency < expoCurrency && playerChoice == 1) {
                System.out.printf("You live for %d more years. Your poor choice cost \n" +
                        "you %d dollars!",years,expoCurrency-currency);
            }else if (currency < expoCurrency && playerChoice == 2) {
                System.out.printf("You live for %d more years so you got lucky and \n" +
                        "will end up with an extra %d dollars!",years, expoCurrency-currency);
            }else if (currency > expoCurrency && playerChoice == 1) {
                System.out.printf("You live for %d more years so you got lucky and \n" +
                        "will end up with an extra %d dollars! %n", years, currency - expoCurrency);
            }else{
                System.out.printf("You live for %d more years. Your poor choice cost \n" +
                        "you %d dollars!",years,currency-expoCurrency);
            }

            //Play again or break out of loop
            System.out.println("\nDo you want to play again? (Y/N)");
            playAgain = in.next();
            while (!playAgain.equals("Y") && !playAgain.equals("N")){
                System.out.println("Please enter either Y or N.");
                playAgain = in.next();
            }
            if (playAgain.equals("N")){
                inGame = false;
            }
        }

    //Simplifies reprinting input statement over and over
    }static void printInput(long currency){
        System.out.print("\nEnter " + '\"' + '1' + '\"' + " if you would prefer to receive $" + currency + " each year \n" +
                "or enter " + '\"' + '2' + '\"' + " if you would rather risk exponential growth: ");
    //Story or scenario. Place here to organize
    }static void story(long currency){
        System.out.println("\nYou lived a simple life, carrying yourself with self respect and integrity.\n" +
                "A fine hard worker at best, working day and night to support the family. \n" +
                "However, you were growing old and it was reaching your time to retire. \n" +
                "One day, as you ponder about the choices you have, you wonder, if you're even able to have the chance. \n" +
                "You stroll the parks in the area, taking it in and coming to the terms that follow your age. \n" +
                "It won't be possible to retire, not at this rate. \n" +
                "\n" +
                "Whilst on your stroll, you come across a rolling bottle on the floor, you wonder, how peculiar, as you pick it up. \n" +
                "You try peaking inside to see what may be stored inside, however, you can't look through it. \n" +
                "With curiosity, you decide to open it up. \n" +
                "Inside the bottle awaits a letter. You begin to read what it has to say. \n" +
                "\n" +
                "The letter reads: \n" +
                "Why hello there, you must be quite surprised where this is from.\n" +
                "I've been watching you work and I must say, you're quite a hard worker if I do say so myself. \n" +
                "I'd like to give you the opportunity as a token of my gratefulness.\n" +
                "You may choose to receive $" + currency + " yearly. \n" +
                "The alternative is to choose to receive a dollar this year, and I will double it every year.\n" +
                "I will leave the money near your door every year, I'd like to remain anonymous for this. A small gift for a friend.");
    }
}
