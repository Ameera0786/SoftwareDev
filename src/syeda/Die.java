/*
* Course: CSC 1110
* Fall 2024
* Exercise 5 - Die class
* Name: Ameera Syed
* 10/8/2024
 */

package syeda;


public class Die {
    //Class Constant
    public final static int DEFAULT_NUM_SIDES = 6;

    //Instance variables
    private int numSides;
    private int currentValue;

    //Sets die side to default
    public Die(){
        numSides = DEFAULT_NUM_SIDES;
    }

    //Sets die side to number given
    public Die(int numSides){
        this.numSides = numSides;
    }

    // Returns the current value of the die
    public int getCurrentValue(){
        return currentValue;
    }

    // Rolls the die by choosing a random side and assigns current value and returns it
    public int roll(){
        currentValue = (int)(Math.random() * numSides + 1);
        return currentValue;
    }

}
