package cse360assignment02;

/**
 * Provides methods for a simple adding machine with
 * functions for adding to a running total, subtracting from it, printing the calculations
 * resetting the running total and previous calculations as well as grabbing the total.
 * 
 * 
 * @author Jesus Bautista
 *
 */

public class AddingMachine {
    private int total;
    private String calculations;

    /**
     * Constructor, initializes running total variable
     */
    public AddingMachine() {
        total = 0; // not needed - included for clarity
        calculations = "0";
    }

    /**
     * Accessor for the running total
     * @return the running total, var total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Adds passed value to running total
     * @param int value to add to running total 
     */
    public void add(int value) {
        total += value;
        calculations += " + " + value;
    }

    /**
     * Subtracts passed value from running total
     * @param int value to subtract from running total 
     */
    public void subtract(int value) {
        total -= value;
        calculations += " - " + value;
    }

    /**
     * Provides string of previous calculations
     * @return string detailing all previous calculations made
     */
    public String toString() {
        return calculations;
    }

    /**
     * Resets running total and previous calculations made
     */
    public void clear() {
        total = 0;
        calculations = "0";
    }
}