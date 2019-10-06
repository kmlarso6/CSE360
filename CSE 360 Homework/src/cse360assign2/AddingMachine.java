package cse360assign2;

/**
 * AddingMachine is the base class that allows a user to add and subtract a
 * value to a total and the total value's history is kept. 
 */
public class AddingMachine {

	private int total;
	
	/**
	 * The constructor of the class that sets the initial total to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total value after previous transactions have been completed.
	 * 
	 * @return 0 (as of right now)
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the given value to the total.
	 * 
	 * @param value	amount to be added
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the given value to the total.
	 * 
	 * @param value	amount to be subtracted
	 */
	public void subtract (int value) {
		
	}
		
	/**
	 * Returns the history of transactions as a string in terms of numbers and
	 * operators.
	 * 
	 * @return a blank string (as of right now)
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * Clears the total value.
	 */
	public void clear() {
	
	}
}
