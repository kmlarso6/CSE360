/*
 * Name: Kent Larson
 * ID: 1213010550
 * Class ID: 70641
 * Assignment #: 3
 * Description: Calculator inherits from AddingMachine, adding methods that
 * 				allow the total to be multiplied by, divided by, or raised to a
 * 				power of a given a value.
 */

package cse360assign3;

public class Calculator extends AddingMachine {
	
	/**
	 * Multiplies the total by the given value.
	 * <p>
	 * The value that the total is multiplied by is also "stored" into the
	 * history so that it can be shown when the method "toString" is called.
	 * 
	 * @param value	amount for the total to be multiplied by
	 */
	public void mult (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * Divides the total by the given value.
	 * <p>
	 * The value that the total is divided by is also "stored" into the
	 * history so that it can be shown when the method "toString" is called.
	 * 
	 * @param value	amount for the total to be divided by
	 */
	public void div (int value) {
		if(value != 0)
		{
			total = total / value;
		}
		else
		{
			total = 0;
		}
		
		history = history + " / " + value;
	}
	
	/**
	 * Raises the total to the given value.
	 * <p>
	 * The value that the total is raised by is also "stored" into the
	 * history so that it can be shown when the method "toString" is called.
	 * 
	 * @param value	power for the total to be raised by
	 */
	public void power (int value) {
		if(value >= 0)
		{
			total = (int) Math.pow(total, value);
		}
		else
		{
			total = 0;
		}
		history = history + " ^ " + value;
	}
}
