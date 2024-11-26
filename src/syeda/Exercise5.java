/*
 * Course: CSC-1110
 * Fall 2024
 * Exercise 5 - Dice
 * Name: Ameera Syed
 * Last Updated: 10-8-2024
 */

package syeda;


/**
 * Driver class for some dice
 */
public class Exercise5 {
    public static void main(String[] args) {
        //Instantiate dice objects
        final int twentySides = 20;
        Die coin = new Die(2);
        Die d6 = new Die();
        Die d20 = new Die(twentySides);

        //Print results to console
        System.out.println("Flipping a coin: " + flipCoin(coin));
        System.out.println("Rolling a d6 and d20: " + rollTwoDice(d6, d20));
    }

    //Rolls a die with 2 sides and assigns head to a roll of 1 and tails to a roll of 2
    private static String flipCoin(Die coin) {
        coin.roll();
        String result = "";
        if (coin.getCurrentValue() == 1){
            result = "Heads";
        } else{
            result = "Tails";
        }
        return result;
    }

    // Returns the sum of 2 rolled dice
    private static int rollTwoDice(Die d1, Die d2) {
        return d1.roll() + d2.roll();
    }
}