/*
 * Name: Kent Larson
 * ID: 1213010550
 * Class ID: 70641
 * Assignment #: 2
 * Description: AddingMachine allows a user to add to, subtract from, or clear
 * 				a total value as well as display the history of transactions of
 * 				the total.
 */

package cse360assign2;

/**
 * AddingMachine is the base class that allows a user to add and subtract a
 * value to a total and the total value's history is kept. 
 */
public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * The constructor of the AddingMachine object that sets the initial total
	 * to 0 and the String "history" to "0".
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the total value after previous transactions have been completed.
	 * 
	 * @return 0 (as of right now)
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the given value to the total.
	 * <p>
	 * The value that is added to the total is also "stored" into the history
	 * so that it can be shown when "toString" is called.
	 * 
	 * @param value	amount to be added
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the given value to the total.
	 * <p>
	 * The value that is subtracted from the total is also "stored" into the
	 * history so that it can be shown when "toString" is called.
	 * 
	 * @param value	amount to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
		
	/**
	 * Returns the history of transactions as a string in terms of numbers and
	 * operators.
	 * 
	 * @return The String variable "history" as it contains the transaction
	 * 		   history of the total.
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Clears the total value and the history of transactions.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
